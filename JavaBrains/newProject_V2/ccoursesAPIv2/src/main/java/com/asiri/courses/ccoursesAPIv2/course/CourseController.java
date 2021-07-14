package com.asiri.courses.ccoursesAPIv2.course;


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

    @RequestMapping("/topics/{id}")
    public Course getTopic(@PathVariable  String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Course newCourse){
        courseService.addCourse(newCourse);
//        Success s = new Success("200", "Added a new resource", newTopic.getId());
//        return s;
    }


    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Course updatedCourse, @PathVariable String id){
        courseService.updateCourse(id, updatedCourse);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic( @PathVariable String id){
        courseService.deleteCourse(id );
    }
}
