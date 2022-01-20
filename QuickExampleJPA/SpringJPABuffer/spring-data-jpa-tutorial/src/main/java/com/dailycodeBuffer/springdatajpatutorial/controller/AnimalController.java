package com.dailycodeBuffer.springdatajpatutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping("/")
    public String getData(){
        return "Hello";
    }
}
