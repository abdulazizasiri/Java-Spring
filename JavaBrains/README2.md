### Spring Boot in a nutshell


Spring Boot makes it easy to create a stand-alone, production-grade Spring based apps thst you can "just run"


### What is Spring?

- Application framework 


- Programming and configuration model


- Infrastruction support 


###  Problem with Spring 

- Huge framework 


- Multiple setup steps 


- Multiple configuration steps


- Multiple build and deply steps 


### What Spring Boot gives us

- Spring boot is opinionated


- Conventin over configurarion 


- Stand alone apps, can just run. 


- Peoduction ready 


### Setup


- Need Java SDK - java 8, 11, or 16 jdks

- Spring STS ( IDE for spring )


### Maven


- Maven jars are located in the
 <code> pom.xml <code> file. 


### Creating a spring project


1- Create a simple Maven project. 

    - Add the spring-boot dependency to it. Add the parent and the dependency of 
    
2- Spring Initilizer




### Staarting the project

So, far we only have a simple java/maven project.  We a need away to tell Java that this is a Spring project. The way we do that is by adding an important annotation. 


<code> @SpringBootApplication </code> 

This annotation tells java that this is a spring application. 

We add this line above the class inside the main method. 


```java


@SpringBootApplication
public class CoursesApIv2Application {

	public static void main(String[] args) {
        // What goes here needs to be discussed here a bit further. 
	}

}


```


Now, we need to tell the main mehtod to run our application which will create a servlet container and hosts our apps. 

We need to call the static method run inside the SpringApplication class.


```java
@SpringBootApplication
public class CoursesApIv2Application {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApIv2Application.class, args);
	}

}


```


### What happens in this line <code> 		SpringApplication.run(CoursesApIv2Application.class, args); </code>