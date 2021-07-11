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
    private TopicService topicService;

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







