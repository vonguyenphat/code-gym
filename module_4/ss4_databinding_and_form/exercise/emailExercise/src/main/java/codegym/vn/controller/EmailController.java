package codegym.vn.controller;

import codegym.vn.model.Customer;
import codegym.vn.service.CustomerService;
import codegym.vn.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class EmailController {
    private final ICustomerService service = new CustomerService();

    @GetMapping("")
    public String index(Model model){
        List<Customer> customers = service.findAll();
        model.addAttribute("customersList", customers);
        return "/index";
    }
}
