package com.springdatajpa.relationships.Relationships.course;


import com.springdatajpa.relationships.Relationships.student.Student;
import com.springdatajpa.relationships.Relationships.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository ;
    private final StudentRepository studentRepository ;

    @Autowired
    CourseController(CourseRepository courseRepository,
                     StudentRepository studentRepository ) {
        this.courseRepository = courseRepository ;
        this.studentRepository = studentRepository ;
    }


    @GetMapping
    List<Course> getAllCourses () {
        return this.courseRepository.findAll();
    }


    @PostMapping
    Course postNewCourse(@RequestBody Course newCourse) {
        return this.courseRepository.save(newCourse);
    }

    @PutMapping(value = "/{courseId}/students/{studentId}")
    Course updatedCourse(@PathVariable Long courseId,
                       @PathVariable Long studentId){
        Course course = this.courseRepository.findById(courseId).orElseThrow();
        Student student = this.studentRepository.findById(studentId).orElseThrow();
        System.out.println("Student printed: "+student);
        return course;


    }
}
