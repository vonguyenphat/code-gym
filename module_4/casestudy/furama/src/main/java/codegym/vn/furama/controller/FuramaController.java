package codegym.vn.furama.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FuramaController {

    @GetMapping("/home")
    public String home(){
        return "home/main-layout";
    }



}
