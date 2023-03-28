package codegym.vn.formdealthdeclaration.controller;

import codegym.vn.formdealthdeclaration.model.HealthDeclaration;
import codegym.vn.formdealthdeclaration.service.IHealthDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HealthDeclarationController {
    @Autowired
    IHealthDeclarationService healthDeclarationService;
    @GetMapping("/home")
    public String index(Model model){
        model.addAttribute("healthDeclaration",healthDeclarationService.findAll());
        return "index";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("healthDeclaration") HealthDeclaration healthDeclaration){
        healthDeclarationService.create(healthDeclaration);
        return "index";
    }

}
