package springlil.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<springlil.topics.Course> getAllTopics(){

        return topicService.getTopics();
    }
    @RequestMapping("/topics/{id}")
    public springlil.topics.Course getTopic(@PathVariable String id) {

        return topicService.getTopicId(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public Success addTopic(@RequestBody springlil.topics.Course topic){
        System.out.println("Topic Desc: "+topic.getDesc());
        Success s = new Success(200, "Successful post");
        topicService.addTopic(topic);
        return s;

    }
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public Success updateTopic(@RequestBody springlil.topics.Course topic, @PathVariable String id){
        Success s = new Success(200, "Successful update");
        topicService.updateTopic(id, topic);
        return s;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public Success deleteTopic(@PathVariable String id){
        Success s = new Success(200, "Successful delete");
        topicService.deleteTopic(id);
        return s;
    }



}
