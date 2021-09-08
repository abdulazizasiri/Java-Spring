package com.udacity.jdnd.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
// This annotation is 3 other combined annotations: @Configuration, @ComponentScan,  @EnableAutoConfiguration
@EnableAutoConfiguration
public class Course1Application {

	public static void main(String[] args) {
		SpringApplication.run(Course1Application.class, args);
	}

	@Bean
	public String nameServices(){
		System.out.println("Hello all"); //
		return "Hello all";
	}

}
