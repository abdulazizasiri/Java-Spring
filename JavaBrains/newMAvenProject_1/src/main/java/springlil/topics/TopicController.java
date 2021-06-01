package springlil.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {

        return topicService.getTopicId(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public Success addTopic(@RequestBody Topic topic){
        Success s = new Success(200, "Successful post");
        topicService.addTopic(topic);
        return s;

    }
}
