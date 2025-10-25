package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Pagecontroller {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Welcome to Home.");

        // Sending data to view.
        model.addAttribute("Name", "Soubhagya Nayak");
        model.addAttribute("YoutubeChannel", "Learning");
        model.addAttribute("Githubname", "LifeDrop");
        model.addAttribute("GitHub", "https://github.com/Soubhagya-Nayak");
        return "home";
    }    

    // About Page.
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("Wlcome to about page.");
        return"about";
    }

    // Service Page.
    @RequestMapping("/service")
    public String servicePage() {
        System.out.println("Welcome to service page.");
        return"service";
    }
}