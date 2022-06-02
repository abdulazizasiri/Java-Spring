package com.springdatajpa.relationships.Relationships.teacher;

import com.springdatajpa.relationships.Relationships.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherRepository teacherRepository ;

    @Autowired
    TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository ;
    }

    @GetMapping
    List<Teacher> getStudents() {
        return this.teacherRepository.findAll();
    }

    @PostMapping
    Teacher postNewTeacher(@RequestBody Teacher teacher) {
        return this.teacherRepository.save(teacher);
    }
}
