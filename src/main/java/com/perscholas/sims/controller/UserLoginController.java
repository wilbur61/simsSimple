package com.perscholas.sims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLoginController {

    @GetMapping("/")
    public String root() {
    	System.out.println("IN root()  redirecting to customers");
        return "redirect:/customers";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    
}
