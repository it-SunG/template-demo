package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author SunG
 * @date 2020/6/8 10:55
 */
@Controller
public class LoginController {

    @GetMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * @RequestParam(name = "")
     * 对应的是 请求 中的参数name的值
      * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String Login(@RequestParam(name = "user") String username,@RequestParam(name = "pass") String password){
        System.out.println(username+" "+password);
//        重新发送一次请求
        return "redirect:welcome";
    }
}
