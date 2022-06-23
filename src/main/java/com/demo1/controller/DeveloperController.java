package com.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("developer")
public class DeveloperController {

    @GetMapping(name = "home", value = {"", "home"})
    public String home() {
        return "developer/home";
    }

}
