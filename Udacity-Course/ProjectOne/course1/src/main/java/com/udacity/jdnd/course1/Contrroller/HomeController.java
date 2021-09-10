package com.udacity.jdnd.course1.Contrroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    private String welcomeMessage ;
    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("greetings", Arrays.asList("Hello","goodbye", "Hi", "What's up"));
        return "home";
    }
    
}
