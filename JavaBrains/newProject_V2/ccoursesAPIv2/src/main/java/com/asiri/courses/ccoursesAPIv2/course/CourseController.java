package com.asiri.courses.ccoursesAPIv2.course;


import com.asiri.courses.ccoursesAPIv2.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id); // All courses associated with this topic Id.
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable  String topicId, @PathVariable  String courseId){
        return courseService.getCourse(courseId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics/{topicsId}/courses")
    public void addTopic(@RequestBody Course newCourse, @PathVariable String topicsId){
        newCourse.setTopic(new Topic(topicsId, "", ""));
        courseService.addCourse(newCourse);
//        Success s = new Success("200", "Added a new resource", newTopic.getId());
//        return s;
    }


    @RequestMapping(method=RequestMethod.PUT, value="/topics/{topicsId}/courses/{courseId}")
    public void updateTopic(@RequestBody Course updatedCourse, @PathVariable String topicsId,
                            @PathVariable String courseId){
        updatedCourse.setTopic(new Topic(topicsId, "", ""));

        courseService.updateCourse(updatedCourse);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicsId}/courses/{courseId}")
    public void deleteTopic( @PathVariable String courseId){
        courseService.deleteCourse(courseId);
    }
}
