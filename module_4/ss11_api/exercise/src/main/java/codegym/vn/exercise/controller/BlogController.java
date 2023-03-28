package codegym.vn.exercise.controller;

import codegym.vn.exercise.model.Blog;
import codegym.vn.exercise.model.CategoryBlog;
import codegym.vn.exercise.service.IServiceBlog;
import codegym.vn.exercise.service.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IServiceBlog serviceBlog;
    @Autowired
    IServiceCategory serviceCategory;


    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("blog", serviceBlog.findAll());
        return "index";
    }

    @GetMapping("/create-blog")
    public String showCreateBlog(Model model) {
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        model.addAttribute("categoryS",serviceCategory.findAll());
        return "create-blog";
    }
    @PostMapping("/create-blog")
    public String createBlog(@Valid @ModelAttribute("blog") Blog blog, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("categoryS",serviceCategory.findAll());
            return "create-blog";
        }
        serviceBlog.create(blog);
        return "redirect:/blog";
    }
    @GetMapping("/index-category")
    public String indexCategory(Model model){
        model.addAttribute("category",serviceCategory.findAll());
        return "index-category";
    }
    @GetMapping("/create-category")
    public String showCreateCategory(Model model) {
        model.addAttribute("category",new CategoryBlog());
        return "create-category";
    }
    @PostMapping("/create-category")
    public String createCategory(@ModelAttribute("category") CategoryBlog category){
        serviceCategory.create(category);
        return "redirect:/blog/index-category";
    }
}
