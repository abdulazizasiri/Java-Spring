package com.springdatajpa.relationships.Relationships.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository ;

    @Autowired
    StudentController(StudentRepository studentRepository) {
     this.studentRepository = studentRepository ;
    }

    @GetMapping
    List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @PostMapping
    Student postNewStudent(@RequestBody Student student) {
        return this.studentRepository.save(student);
    }
}
