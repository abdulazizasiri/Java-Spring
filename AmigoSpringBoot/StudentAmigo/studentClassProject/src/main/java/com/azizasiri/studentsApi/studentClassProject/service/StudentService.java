package com.azizasiri.studentsApi.studentClassProject.service;

import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents(){
        return List.of(new Student(1L, "Moe", "moe@gmail.com",
                LocalDate.of(2000, Month.APRIL, 11), 22));

    }
}
