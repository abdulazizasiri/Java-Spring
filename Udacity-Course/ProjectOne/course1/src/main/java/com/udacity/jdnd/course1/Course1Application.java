package com.udacity.jdnd.course1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@SpringBootApplication
// This annotation is 3 other combined annotations: @Configuration, @ComponentScan,  @EnableAutoConfiguration
@SpringBootApplication
public class Course1Application {

	public static void main(String[] args) {
		SpringApplication.run(Course1Application.class, args);
	}
//
//	@Bean //  Register application context - Spring container ---> Object --> Run
//	public String nameServices() {
//		System.out.println("Hello all"); //
//		return "Hello all";
//	}
//
//	@Bean //  Register application context - Spring container ---> Object --> Run
//	public String nameServices2(){
//		System.out.println("My name is Abdulaziz"); //
//		return "Aziz is the best of  all";
//	}
//
//	@Bean
//	public static int counthars(String nameServices2) { // Parametr ->
//		System.out.println(nameServices2.length());
//		>>؟return nameServices2.length();
//	}

}
