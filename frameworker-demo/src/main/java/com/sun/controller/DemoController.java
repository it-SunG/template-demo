package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("info","Freemarker");
//        model.addAttribute("str",null);
        return "welcome";
    }
}
