package codegym.vn.controller;

import codegym.vn.model.Customer;
import codegym.vn.service.CustomerRepository;
import codegym.vn.service.ICustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class EmailController {
    private final ICustomerRepository service = new CustomerRepository();

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customers = service.findAll();
        model.addAttribute("customersList", customers);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        List<Customer> customers = service.findAll();
        model.addAttribute("customersList", customers);
        return "/create";
    }

    @PostMapping("/create")
    public String save(Customer customer) {
        service.save(customer);
        return "redirect:/customer";
    }
}
