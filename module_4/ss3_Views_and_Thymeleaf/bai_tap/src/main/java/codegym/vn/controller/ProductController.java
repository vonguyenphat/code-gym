package codegym.vn.controller;

import codegym.vn.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.IProductService;
import service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    private IProductService productService = new ProductService();

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "/view";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("product") Product product) {
        product.setId((int) (Math.random() * 1000));
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model model) {
        productService.remove(id);
        return "redirect:/product";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        productService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }
    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        if (search.equals("")){
            return "redirect:/product";
        }
        model.addAttribute("productList",productService.search(search));
        return "/view";
    }
}
