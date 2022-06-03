package com.springdatajpa.relationships.Relationships.course;


import com.springdatajpa.relationships.Relationships.student.Student;
import com.springdatajpa.relationships.Relationships.student.StudentRepository;
import com.springdatajpa.relationships.Relationships.teacher.Teacher;
import com.springdatajpa.relationships.Relationships.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

  private final CourseRepository courseRepository;
  private final StudentRepository studentRepository;
  private final TeacherRepository teacherRepository;

  @Autowired
  CourseController(CourseRepository courseRepository,
                   StudentRepository studentRepository, TeacherRepository teacherRepository) {
    this.courseRepository = courseRepository;
    this.studentRepository = studentRepository;
    this.teacherRepository = teacherRepository;
  }


  @GetMapping
  List<Course> getAllCourses() {
    return this.courseRepository.findAll();
  }


  @PostMapping
  Course postNewCourse(@RequestBody Course newCourse) {
    return this.courseRepository.save(newCourse);
  }

  @PutMapping(value = "/{courseId}/students/{studentId}")
  Course updatedCourse(@PathVariable Long courseId,
                       @PathVariable Long studentId) {
    Course course = this.courseRepository.findById(courseId).get();
    Student student = this.studentRepository.findById(studentId).get();
    course.enrollStudent(student);
    return this.courseRepository.save(course);


  }

  @PutMapping(value = "/{courseId}/teachers/{teacherId}")
  Course assignTeacherToCourse(@PathVariable Long courseId,
                               @PathVariable Long teacherId) {
    Course course = this.courseRepository.findById(courseId).get();
    Teacher teacher = this.teacherRepository.findById(teacherId).get();
    course.assignTeacherToCourse(teacher);
    return this.courseRepository.save(course);
  }
}
