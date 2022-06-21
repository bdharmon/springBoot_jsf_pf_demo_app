package com.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    public LoginController() {
        System.out.println("*** LoginController bean created. ***");
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("home")
    public String home() {
        return "home";
    }

}
