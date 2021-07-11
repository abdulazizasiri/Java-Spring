package com.asiri.courses.ccoursesAPIv2.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable  String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public Success addTopic(@RequestBody Topic newTopic){
        topicService.addTopic(newTopic);
        Success s = new Success("200", "Added a new resource", newTopic.getId());
        return s;
    }


    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic updatedTopic, @PathVariable String id){
        topicService.updateTopic(id, updatedTopic );
    }


    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic( @PathVariable String id){
        topicService.deleteTopic(id );
    }
}
