package com.azizasiri.studentsApi.studentClassProject;

import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class StudentClassProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentClassProjectApplication.class, args);
	}



}
