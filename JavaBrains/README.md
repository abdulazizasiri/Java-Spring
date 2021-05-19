## What is Spring Boot? 

Spring boot makes it easy to create stand-alone, production-grade Spring based applications that you can "just run". 

- Spring is not just a dependency injection framework anymore. 


### Ways to create a a spring project.


- Create a maven project. (From Scratch)

1- Add in the pom.xml file the parent org.springframework.boot  to let maven that this is a spring boot project.  



2- Add the spring boot project. 



3- Build the application. 



4- dependenciies (JARs) will be addedd to the projecvt structure. 



### What happens when reading tne spring application. 


- <code>  SpringApplication.run(SpringV.class, args);  </code> with its annotations does a lot of things. 



1- Sets up default configuration

2- Starts Spring applicatiion context. 

3- performs class path scan 

4- Starts Tomcat server. 



### Adding a Controller. 


There are two main annotations to use a controller. 


1- @RestController: This definies the whole class to be  controller. 

2- @RequestMapping("URL")


Note: The controller has to be inside the main project package. 

MAIN_PROJECT --->
                  CONTROLLER

3- @RestController will return by default a JSON since it is annottated with #RestController. 




## Spring Boot come with Embedded Tomcat Server 

1- Convenience 

2- Servlet container config is now application config

3- Standalone applicatioin

4- Useful for microservices. 


### Unit 2: Spring MVC Controller. (View Tier)

Spring MVC let us build these controllers which maps request to responses.


### The rest aapi we will build: Course API 

- Resources: We will have three different resources. 


1- Topic,  Course,  Lesson 


for the topics

1- GET  /topics Get all topics

2- GET /topics/id Get one topic

3- POST /topics creaate/post a new topic

4- PUT /topics/id update the topics. 

5- DELETE /topics/id Deletes the topic 

### Creating a business service

Whaat is a business service? 
A business service are singletons in spring. 

Since a singleton is a creational pattern, it will help us creste things in spring. 


When a spring application starts up, spring creates an instance of this service, and keeps that in the memory. 


We can other controllers dependds on this service. 




