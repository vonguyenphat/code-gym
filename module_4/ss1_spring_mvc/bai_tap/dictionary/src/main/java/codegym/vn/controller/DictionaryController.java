package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class DictionaryController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/test")
    public String display(Model model , String eng){
        Map<String,String> map = new HashMap<>();
        map.put("hello","xin chào");
        map.put("hi","xin chào");
        map.put("dog","chó");
        map.put("cat","mèo");
        map.put("mother","mẹ");
        Set<String> set = map.keySet();
        String result = "";
        for (String s: set) {
            if (s.equalsIgnoreCase(eng)){
                result = map.get(s);
                break;
            }
        }

        model.addAttribute("eng",eng);
        model.addAttribute("vn",result);
        return "home";
    }
}
