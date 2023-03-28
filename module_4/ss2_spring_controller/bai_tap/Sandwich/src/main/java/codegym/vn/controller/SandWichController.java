package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/save")
    public String save(Model model, @RequestParam("condiment") String[] condiment) {
        String kq = "";
        for (String s : condiment) {
            kq += s;

        }
        model.addAttribute("kq", kq);
        return "home";

    }
}
