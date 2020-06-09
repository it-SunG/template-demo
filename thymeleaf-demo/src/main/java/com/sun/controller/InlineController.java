package com.sun.controller;

import com.sun.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SunG
 * @date 2020/6/8 22:32
 */
@Controller
public class InlineController {

    @GetMapping("/inline")
    public String inline(Model model){
        List<User> list = new ArrayList<>();
        User u1 = new User("sun1",18);
        User u2 = new User("sun2",28);
        User u3 = new User("sun3",38);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("list",list);

        model.addAttribute("info","sun");
        return "inline";
    }
}
