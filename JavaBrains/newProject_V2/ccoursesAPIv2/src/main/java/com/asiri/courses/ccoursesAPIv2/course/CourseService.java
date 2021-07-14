package com.asiri.courses.ccoursesAPIv2.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id) {
        List <Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        System.out.println("Topucs "+ course.getId());
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course updatedCourse) {
        courseRepository.save(updatedCourse);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
