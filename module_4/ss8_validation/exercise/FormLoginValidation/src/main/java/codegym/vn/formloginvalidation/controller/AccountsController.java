package codegym.vn.formloginvalidation.controller;

import codegym.vn.formloginvalidation.model.Accounts;
import codegym.vn.formloginvalidation.service.IAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class AccountsController {
    @Autowired
    IAccountsService accountsService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("accounts", new Accounts());
        return "index";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute(value = "accounts") Accounts accounts, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            accountsService.create(accounts);
            return "redirect:/login";
        }

    }
}
