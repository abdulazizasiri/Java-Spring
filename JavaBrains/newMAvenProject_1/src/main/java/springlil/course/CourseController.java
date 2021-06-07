package springlil.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("topics/{id}/courses")
    public List<Course> getAllTopics(@PathVariable String id){

        return courseService.getCourses(id);
    }
    @RequestMapping("topics/{topicid}/courses/{courseId}")
    public Course getCourse(@PathVariable String topicid, @PathVariable String courseId) {

        return courseService.getCourseId(courseId);
    }

    @RequestMapping(method=RequestMethod.POST, value="topics/{id}/courses")
    public Success addTopic(@PathVariable String id, @RequestBody Course topic){
        System.out.println("Topic Desc: "+topic.getDesc());
        Success s = new Success(200, "Successful post");
        courseService.addCourse(topic);
        return s;

    }
    @RequestMapping(method=RequestMethod.PUT, value="/courses/{id}")
    public Success updateTopic(@RequestBody Course topic, @PathVariable String id){
        Success s = new Success(200, "Successful update");
        courseService.updateCourse(id, topic);
        return s;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
    public Success deleteTopic(@PathVariable String id){
        Success s = new Success(200, "Successful delete");
        courseService.deleteCourse(id);
        return s;
    }



}
