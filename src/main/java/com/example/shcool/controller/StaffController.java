package com.example.shcool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    @GetMapping("home")
    public String home(){

        return "home-page/index";
    }
}
