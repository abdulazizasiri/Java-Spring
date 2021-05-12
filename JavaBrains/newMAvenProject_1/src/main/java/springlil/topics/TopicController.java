package springlil.topics;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Java", "Java Spring", "It is OOP"),
                new Topic("JavaScript", "NodeJS", "It is the language of the web"),
                new Topic("Swift", "Amazing and simple", "IOS Language")
        );
    }
}
