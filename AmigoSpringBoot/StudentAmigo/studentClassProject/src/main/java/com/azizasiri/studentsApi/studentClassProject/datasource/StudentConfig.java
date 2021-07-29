package com.azizasiri.studentsApi.studentClassProject.datasource;

import com.azizasiri.studentsApi.studentClassProject.dao.StudentRepository;
import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student abdulaziz = new Student(

                    "Abdulaziz",
                    "asiriaabdulaziz@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 5),
                    21
            );
           Student jessica = new Student(
                    "Jessica",
                    "jessia@gmail.com",
                    LocalDate.of(1990, Month.FEBRUARY, 10),
                    30
                    );
           Student Moe =  new Student(
                    "Moe",
                    "Moe@outlook.com",
                    LocalDate.of(1980, Month.FEBRUARY, 10),
                    44
            );
        };
    }
}
