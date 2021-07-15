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

There are a number of things Spring does when running this line


1- Sets up default configuration. IT convigures tha majority or the essentials of the project since it favors convention over configuration


2- Start a spring application context

Spring is nothing but a container for the code that runs on for your app server such as busines services, view controller, data services. Spring access a container for all these services. This container is what is called an application context. 





3- Perform class path scan

This is important because our java classes are almost all marked with annotations that do a specifc thing. classes for controller, data and many more annotations. Spring has to lookup up for the project path and check which class is for which purpose. 




4- Starts a Tomcat server 


This is a server that needs to be created in order to host our apps. 

Note: Our server will give an error everytime we access it because we did not tell it what to do when we access the link.


### Adding a REST contrller

A controller is what spring let us do to make it run specifc code on a servlet contrainer. It is broken down to 

A controller is:


1- A java class

2- Marked with annotations

3- Has Info about

    - What URL access triggers it?

    - What method to run when access?


When to create a class and annotate it with <code> RestController </code>

What is special about this annoation. 

The special thing about this annotation is that we can have methods in this class which mapps to URL requests. 


- Creating a method with a mapping to a url. 


We need to use the annotation <code> @RequestMapping </code>


<code> @RequestMapping </code>  takes a parameter which is what url once access should execute this method. 



Note: <code> @RequestMapping </code>  by default is a GET http method. 

To use other methods, we need to specify thme in the <code> @RequestMapping </code>  annotation. 



```java

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String sayHi(){
        return  "Hi"; // When access this url :/hello, print Hi
    }
}


```


### Returning an Object from a controller. 


Let's in this example create a request mapping that returns an array of object. This object should contain three elements 

1- id

2- name

3- description 

We need to call it <code> Topic </code>


We want to create a class called <code> Topic </code> and It should have 3 fields


1- String id

2- String name

3- String description 


This is model class in java


```java

public class Topic {
    private String id;
    private String name;
    private String description ;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

```

This class has also <code>  getters and setters </code>


### Reason why Spring uses Tomcat


1- Convenience 


2- Servletconttainer config is now application config

3- Standalone application

4- USeful for microservices architecture 

## Part 2: Spring MVC: The View Tier 

What is the "view" tier in Spring boot application? 

view tier in spring boot app is handled by a framework called <code> Spring MVC </code>



Spring MVC is another Spring project whihc helps us map 

We will look at Spring MVC later on. 


### Project we will be building.


- Course API 

    1- Resources: Topic, Course, Lesson

        2- Topic resource:
            1- GET  /topics  which gets all topics
            2- GET /topics/id Get a specifc topic
            3- POST /topics Create a new topics
            4- PUT /topics/id update a specifc topic
            5- DELETE /topics/id deletes a specifc topic


## Creating a business service 

What is a service? 

I  spring, a service is a singleton. When an application starts up, spring creates an instance of the servie in memory. 

The idea of a service is that we create it once and inject it in multiple controllers. 

Note: When we inject a service in a controller, we are using an already created object of that service that spring created. 


- How do we use/inject a service in a controller? 

We inject it by using an annotation called <code> AutoWired </code>

```java

@RestController
public class TopicController {

    private TopicService topicService;
    @RequestMapping("/topics")
    public String getAllTopics(){
        return "Get all topics";
    }
}


```


- So, how do we inject it in a controller? 

as I just mentioned above we need to use <code> AutoWired </code>


This is the code that does this


```java

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService; // Services a

}

```


### Getting a single resourcev from the path. 


Sometimes we want to get the a single resource based on the provided path. 

There are  new annotations for that 😂. 

First, we need to specify what are capturing from the URL, and we do this by adding <code> {VAR} </code>


```java 

@RequestMapping("/topics/{id}")

```

Then in the method associated with this url, we need to add an annotation to the paramter to let the method know that this is what we are capturing. 

The annotation is <code> @PathVariable</code>

```java

@RequestMapping("/topics/{id}")
public Topic getTopic(@PathVariable  String id){
    return topicService.getTopic(id);
}


```


### Posting a new resource 

so far we have been doing get requests, and we know that we are using 

<code> RequestMapping </code> to that, but now, we need to use <code> RequestMapping </code> a little bit differently. 

We can specify a <code> POST </code> request in the requestMapping by providing extra information to the annotation such as 

1- Method

2- Value

Like this


```java

@RequestMapping(method=RequestMethod.POST, value="/topics")


```


This is saying that we are targeting a post request to the url specified in the value param. 

- What are we posting? 

post rquests have a body which carry the information sent to the server. 


We must have 

1- Request body are serlized by default so we do not need to do that manualeey. This is done by the help of  <code> @RequestBody</code> annotation



2- We need to add a header and specify the content type to be  application/json<code> Content-Type : Application/json
 </code>

```java
  @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic newTopic){
        topicService.addTopic(newTopic);
     
    }

```



### Deleting and Uppdatigng resources. 

Delete and put methods are almost the same. To update  we need two info

1- id of the object to be updated

2- the object data that needs to be changed


```java

  @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic updatedTopic, @PathVariable String id){
        topicService.updateTopic(id, updatedTopic );
    }

```


- For deleting, we need to only the id of the object that is need to be deleted.


```java
@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
public void deleteTopic( @PathVariable String id){
    topicService.deleteTopic(id );
    }

```



# Unit 3 Booting Spring boot


In this unit, we will see how to create different ways to create a spring app


1- Spring Initializr

2- CLI

3- STS (Not recommended)

4- (my way) use Visual Studio Code


### customizing Spring Boot

- Application.properties

<code> application.properties </code> is a file in a spring project that let's you configure somethings in the project. The file is a key-value pair. One of the things that we can configure are:

1- server port


<code> server.port=8081 </code>


There is a list of common application.properties in java spring. 

They are on this like

https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html


# Unit 4 JPA 😱

Spring Data JPA: The Data Tier

- What is a JPA?

It is Java Persistence API. This is a specification that helps us do ORM 
(Object - Relational Mapping)

This helps us to connect to realational database drivers, or Sql based database.

The advanvtage of that is to map SQL commands to code.

1- Class <-> Table


2- Class props <-> Columns


### Adding two dependencies to work with JPA and local database 


```xml

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>


		<dependency>
			<groupId>org.apache.derby</groupId>
			<artifactId>derby</artifactId>
		</dependency>

```

- Spring data JPA is what allows us to create the mapping from classes to tables.


- Derby is a local database which will let us test our  knowledge. 


### How to create a table (Class ORM)


- Create a model simple Pojo which is basically a java class. 


- This model needs to be marked with an annotation that will help JPA convert it to its respective table. 

- The annotation is <code>  @Entiy </code>


- There is a property in the class that will be used as a <code> Primary Key </code>


- Turns out that there is a special annotation to mark this propert as a primary key. IT is  <code> @Id </code>

### Repositories in Spring Data JPA

The way we access JPA in spring Data JPA is by creating a serperate <code> interface </code> and make extends a special interface called  <code> CrudRepository </code>

- The <code>CrudRepository </code> is an interface that has an already-built ins quries such as (update, insert, delete and get) Not need to implement these mehtod; however, If a special need for a method that is not provided by the defualt methods in the CrudRepository, then we need to do that manuelly. We will explin this in the subsequent section. 


### Refactoring our codebase by using  a database. 


- We will be adding an embedded database in our application, so we will delete all the code that stores data in simple data structure in the application. I will be using <code> Dorby </code> embbeded database (local storage in spring boot)


- First, we need to create a reposioty interfce and extends the <code> CrudRepository </code> 


```java

import org.springframework.data.repository.CrudRepository;
public interface TopicRepository extends CrudRepository<Topic, String> {

}

```

Note: this interface does not have any methods yet. We only need the inherited methods from CrudRepository such as. Once we need to perform a complex query which involves adding relationships and joining other tables, then we will need to add our own custom method. 


### Interacting with multiple tables (Joining)


We need in the package which includes <code>Coursecontroller </code>, <code>Course entity </code>, <code>CourseServe </code>, and<code>CourseRepository </code> to include a link to the Topic entity since a topic has many courses. It is called a  <code>One-to-Many </code> relationship. 


###  Listing records based on an ID of another table


Now, We have to create our own method for listing elements based on an id of another table. 


-  Note: This is amazing. we can right a method inside our intrface in away that tells JPA to create our custom implementation. 

This is pretty cool. 


- Example, let's say we have an Entity one and another Enitiy two. 

then we have a design that creates an entity two can have many of entity on. This relationship is called  <code> ManyToOne</code>


Example: We have this interface which resembles Entity one.



```java

public interface TopicRepository extends CrudRepository<Topic, String> {

}


```


Example of entity two which will have many of entity one.


```java

public interface CourseRepository extends CrudRepository<Course, String> {
    // This mehtod  will be used for filttering by topic, will talk discuss it later. 
    public List<Course> findByTopicId(String topicId);
}



```


- The naming convnetion. 

The JPA data layer has a pretty amazing way to create methods that interacrs with the database. You see that we the name of the method that fetches data based on the topic id is  <code>findByTopicId</code>. 

In order for the JPA to create implementation for the methods we write inside the interface, we need to write the name of the method in s certain way. The fetch data, the first word of the method name should start with <code> find </code>, followed by <code> By </code> then whatever propery we are searcing for inside the entity for example in our example we have

- <code>  findByTopicId </code> we have topic as a propery inside the  <code> Course </code> entity or class.

- Topic is a class which also has more props. 

- We have <code> Id </code> inside Topic which is used to find the id of a topic. 



