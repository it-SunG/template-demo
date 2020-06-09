package com.sun.controller;

import com.sun.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SunG
 * @date 2020/6/8 9:44
 */
@Controller
public class UserController {

    @RequestMapping("/welcome")
    public String welcome(Model model){
        User u = new User("sun",18);
        model.addAttribute("user",u);
        model.addAttribute("msg","yes");
        model.addAttribute("num",1);
        List<User> list = new ArrayList<>();
        User u1 = new User("sun1",18);
        User u2 = new User("sun2",28);
        User u3 = new User("sun3",38);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("list",list);
        return "welcome";
    }

    @RequestMapping("/spel")
    public String spel(Model model){

        List<User> list = new ArrayList<>();
        User u1 = new User("sun1",18);
        User u2 = new User("sun2",28);
        User u3 = new User("sun3",38);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("list",list);
        return "spel";
    }
}
