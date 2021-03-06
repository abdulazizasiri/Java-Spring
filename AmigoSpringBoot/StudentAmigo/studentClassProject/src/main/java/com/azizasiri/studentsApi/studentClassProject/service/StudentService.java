package com.azizasiri.studentsApi.studentClassProject.service;

import com.azizasiri.studentsApi.studentClassProject.dao.StudentRepository;
import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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

    public void addNewStudent(Student student) {

        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean doesExist = studentRepository.existsById(id);
        if(!doesExist) {
            throw new IllegalStateException("student with id"+ id + "does not exits");
        }
        studentRepository.deleteById(id);
    }
}
