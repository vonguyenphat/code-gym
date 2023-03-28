package com.example.blogexpanse.controller;

import com.example.blogexpanse.entity.Category;
import com.example.blogexpanse.entity.Blog;
import com.example.blogexpanse.service.ICategoryService;
import com.example.blogexpanse.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showBlog(Model model) {
        List<Blog> blogs = blogService.findAll();
        List<Category> categories = categoryService.findAll();
        model.addAttribute("blogs", blogs);
        model.addAttribute("categories", categories);
        return "blog/index";
    }

    //Phân trang theo james
    //@PageableDefault số lượng trang hiển thị
//    @GetMapping("/paging")
//    public String showBlogWithPageing(Model model, @PageableDefault(value = 10) Pageable pageable,
//                                      @RequestParam("search")Optional<String> search) {
//        Page<Blog> blogs;
//        if (search.isPresent()){
//            blogs = blogService.findAllByTitle(search.get(), pageable);
//        } else {
//            blogs = blogService.findAllWithPaging(pageable);
//        }
//        List<Category> categories = categoryService.findAll();
//        model.addAttribute("blogs", blogs);
//        model.addAttribute("categories", categories);
//        model.addAttribute("Paging", "Paging"); // để hiện phân trang hay ko ở index
//        return "blog/index";
//    }

    //Phân trang theo demo
    @GetMapping("/paging")
    public String showBlogWithPagingAndSort(Model model, @RequestParam("page") Optional<Integer> page,
                                            @RequestParam("size") Optional<Integer> size,
                                            @RequestParam("sort") Optional<String> sort,
                                            @RequestParam("search")Optional<String> search) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("datePublish");
        Page<Blog> blogs;
        if (search.isPresent()){
            blogs = blogService.findAllByTittle(search.get(), PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending()));
            model.addAttribute("search", search.get());
        } else {
            blogs = blogService.findAllWithPagingAndSort(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending()));
        }
        model.addAttribute("blogs", blogs);
        int totalPages = blogs.getTotalPages();
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "blog/index-paging";
    }


    @GetMapping("admin/create")
    public String createForm(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.findAll());
        return "blog/create";
    }

    @PostMapping("admin/create")
    public String create(Model model, @ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("message", "Create new blog successful");
        return "blog/create";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "blog/detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") Long id) {
        String title = blogService.findById(id).getTitle();
        blogService.delete(id);
        model.addAttribute("message", "Delete " + title + "successful");
        return "redirect:/blog";
    }

    @GetMapping("admin/edit/{id}")
    public String editForm(Model model, @PathVariable("id") Long id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "blog/edit";
    }

    @PostMapping("admin/edit")
    public String edit(Model model, @ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        model.addAttribute("blog", blog);
        model.addAttribute("message", "edit successful");
        return "blog/edit";
    }

    @GetMapping("/category/{categoryName}")
    public String showBlogByCategoryName(Model model, @PathVariable("categoryName") String categoryName) {
        model.addAttribute("blogs", blogService.findAllByCategoryName(categoryName));
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute(("categoryName"), categoryName);
        return "blog/category";
    }

    @GetMapping("/deny")
    public String deny() {
        return "deny";
    }
}
