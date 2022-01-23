package com.dailycodeBuffer.springdatajpatutorial.controller;


import com.dailycodeBuffer.springdatajpatutorial.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping("/")
    public String getData(){
        Student s = new Student();
        return "Hello";
    }
}
