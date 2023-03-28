package codegym.vn.wedblog.controller;

import codegym.vn.wedblog.bean.Blog;
import codegym.vn.wedblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    @Qualifier("BlogService")
    private IBlogService blogService;

    @GetMapping("/list")
    public String index(Model model) {
        model.addAttribute("listBlog", blogService.getAll());
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute ("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable ("id") Integer id, Model model){
        model.addAttribute("blog", blogService.findByIdMy(id));
        return "delete";
    }
    @PostMapping("/remove")
    public String remove(@ModelAttribute ("blog") Blog blog, Model model){
        blogService.deleteById(blog.getId());
        model.addAttribute("mes","Xoa thanh cong");
        return "redirect:/blog/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable ("id") Integer id, Model model){
        model.addAttribute("blog", blogService.findByIdMy(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute ("blog") Blog blog, Model model){
        blogService.save(blog);
        model.addAttribute("mes","Xoa thanh cong");
        return "redirect:/blog/list";
    }

    @GetMapping("/blogs")
    public ModelAndView listCustomers(Pageable pageable ){
        Page<Blog> listBlog = blogService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("listBlog", listBlog);
        return modelAndView;
    }

}
