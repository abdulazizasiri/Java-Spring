package com.asiri.courses.ccoursesAPIv2.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("java", "Java is awesome", "Java is great for building web apps"),
                new Topic("swift", "Swift is new and beatiful", "Swift is great for building IOS native apps"),
                new Topic("javascrippt", "javascript has evolved tremendously", "javaScript was created in 10 days")
        );
    }
}
