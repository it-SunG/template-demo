package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @author SunG
 * @date 2020/6/8 21:37
 */
@Controller
public class InnerObjectController {

    @GetMapping("/inner")
    public String inner(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("str","hello world");
        return "innerObject";
    }
}
