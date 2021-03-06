package springlil.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springlil.topics.Course;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("topics/{id}/courses")
    public List<springlil.course.Course> getAllTopics(@PathVariable String id){

        return courseService.getCourses(id);
    }
    @RequestMapping("topics/{topicid}/courses/{courseId}")
    public springlil.course.Course getCourse(@PathVariable String topicid, @PathVariable String courseId) {

        return courseService.getCourseId(courseId);
    }

    @RequestMapping(method=RequestMethod.POST, value="topics/{topicId}/courses")
    public Success addCourse(@PathVariable String topicId, @RequestBody springlil.course.Course course){
        course.setTopic(new Course(topicId,"", ""));
        Success s = new Success(200, "Successful post");
        courseService.addCourse(course);
        return s;

    }
    @RequestMapping(method=RequestMethod.PUT, value="topics/{topicId}/courses/{id}")
    public Success updateTopic(@RequestBody springlil.course.Course course, @PathVariable String id, @PathVariable String topicId ){
        Success s = new Success(200, "Successful update");
        course.setTopic(new Course(topicId, "", ""));
        courseService.updateCourse(id, course);
        return s;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="topics/{topicId}/courses/{courseId}")
    public Success deleteTopic(@PathVariable String topicId, @PathVariable String courseId){
        Success s = new Success(200, "Successful delete");
        courseService.deleteCourse(courseId);
        return s;
    }



}
