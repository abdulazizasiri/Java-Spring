package com.udacity.jdnd.course1.Contrroller;


import com.udacity.jdnd.course1.MessageForm;
import com.udacity.jdnd.course1.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {
   private MessageListService messageListService;

    public HomeController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }

    @RequestMapping("/home")
    public String getHome(@ModelAttribute("newMessage")  MessageForm newMessage, Model model){
        model.addAttribute("greetings", this.messageListService.getMessage());
        return "home";
    }


    @PostMapping("/home")
    public String addMessage(@ModelAttribute("newMessage") MessageForm messageForm, Model model) {
        messageListService.addMessage(messageForm.getText());
        model.addAttribute("greetings", messageListService.getMessage());
        messageForm.setText("");
        return "home";
    }
    
}
