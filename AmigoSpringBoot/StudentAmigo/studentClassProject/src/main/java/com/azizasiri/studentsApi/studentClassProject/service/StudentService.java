package com.azizasiri.studentsApi.studentClassProject.service;

import com.azizasiri.studentsApi.studentClassProject.dao.StudentRepository;
import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
