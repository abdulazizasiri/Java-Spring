package com.azizasiri.studentsApi.studentClassProject.dao;

import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
}
