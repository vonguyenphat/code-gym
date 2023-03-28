package codegym.vn.controller;

import codegym.vn.bean.Customer;
import codegym.vn.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class ControllerCustomer {
    @Autowired
    ICustomerService customerService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listCustomer", customerService.findAll());
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Customer customer){
        customerService.create(customer);
        return "redirect:/customer";
    }
}
