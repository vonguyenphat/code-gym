package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/test")
    public String test(@RequestParam("toantu") String[] toantu, @RequestParam(value = "number1") float number1, @RequestParam(value = "number2") float number2, Model model) {
        float kq = 0;
        for (String s : toantu) {
            switch (s) {
                case "cong":
                    kq = number1 + number2;
                    break;
                case "tru":
                    kq = number1 - number2;
                    break;
                case "nhan":
                    kq = number1 * number2;
                    break;
                case "chia":
                    kq = number1 / number2;
                    break;
            }
        }
        model.addAttribute("kq",kq);
        model.addAttribute("n1",number1);
        model.addAttribute("n2",number2);
        return "home";
    }
}
