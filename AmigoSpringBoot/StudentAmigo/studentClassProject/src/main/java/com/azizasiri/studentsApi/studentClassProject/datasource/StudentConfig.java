package com.azizasiri.studentsApi.studentClassProject.datasource;

import com.azizasiri.studentsApi.studentClassProject.dao.StudentRepository;
import com.azizasiri.studentsApi.studentClassProject.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student abdulaziz = new Student(

                    "Abdulaziz",
                    "asiriaabdulaziz@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 5)

            );
           Student jessica = new Student(
                    "Jessica",
                    "jessia@gmail.com",
                    LocalDate.of(1990, Month.FEBRUARY, 10)

                    );
           Student moe =  new Student(
                    "Moe",
                    "Moe@outlook.com",
                    LocalDate.of(1980, Month.FEBRUARY, 10)

            );
           repository.saveAll(
                   List.of(abdulaziz, jessica, moe)
           );
        };
    }
}
