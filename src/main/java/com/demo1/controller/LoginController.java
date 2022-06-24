package com.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    public LoginController() {
        System.out.println("*** LoginController bean created. ***");
    }

    @GetMapping(value = {"/", "login"})
    public String login() {
        return "login";
    }

    @GetMapping(value = "home")
    public String home() {
        return "home";
    }

}
