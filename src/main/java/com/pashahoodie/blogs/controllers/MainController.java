package com.pashahoodie.blogs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("title", "Main Page");
        return "main";
    }

    @GetMapping("/about")
    public String main1(Model model){
        model.addAttribute("title", "About Us");
        return "about";
    }
}
