package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenDoi {
    @GetMapping("/home")
    public String home(){
        return "list";
    }

    @PostMapping("/test")
    public String calculate(Model model,  float a){
        float result = 23000* a;
        model.addAttribute("a",a);
        model.addAttribute("result",result);
        return "list";
    }
}
