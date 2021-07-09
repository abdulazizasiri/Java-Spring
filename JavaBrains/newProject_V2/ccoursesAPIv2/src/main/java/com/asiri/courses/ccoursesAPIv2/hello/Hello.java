package com.asiri.courses.ccoursesAPIv2.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String sayHi(){
        return  "Hi";
    }
}
