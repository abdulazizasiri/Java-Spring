### Spring Framework 

Java web development with Spring Boot 


There  are three main components in a web application


1- Data Storage -> How the data is stored
 
2- Application Logic -> What kind of service provide the logic for your application 

3- Client Access  ->  What kind of client access your services 


### Spring 

Spring is a framework that encompasses many useful Java libraries for web development. Spring includes numerous essential web development "components", such as database access, security, cloud deployment, web services, and many more.


### Spring Boot 

Spring Boot is a part of the Spring framework, which helps in rapid application development. Spring Boot helps to develop stand-alone and enterprise web applications. The advantage of using Spring Boot is that developers can get started with Spring's core libraries with a minimum configuration setup. Therefore, Spring Boot helps to speed up application development.

### Spring versus Spring Boot

Spring versus Spring Boot
Both Spring and Spring Boot frameworks help to build microservices-based web applications. Internally, the Spring Boot is built on top of the Spring framework. In general, the Spring (core module) takes care of the actions, such as:

1- Inversion of Control (IoC)

2- Dependency injection

3- Common annotations

4- Implements and provides the foundation for other frameworks, such as Thymeleaf, MyBatis, Spring MVC, and many others.

Whereas, Spring Boot brings all the functionality of Spring and some additional advantages, such as:

1- It can automatically configure Spring and third-party libraries

2- It provides necessary dependencies to ease the build configuration


This way, Spring Boot helps to speed up application development. It is a matter of software requirements to choose between Spring and Spring Boot frameworks. Either of the frameworks can be used to build microservices-based web applications. However, Spring Boot helps to get things done faster.


### Where Spring boot shines? 

Spring boot shines when you want to do the following:


1- If your project aims to connect simultaneous users on different clients, you probably need to build a server, which Spring Boot can help with.


2- If your project needs a good integration with a database

3- If you to render something to the clinet so, she/he can interact with it

and many more

However, Java is not as performant as other languages such as <code> Rust, Go, C++, C </code>


### Course Outline

- Basics of Java server architecture, dependency management in Java, and how Spring integrates with both.

- Core Spring principles. We'll be covering dependency injection, bean configuration, service development, and server-wide configuration.


- Spring MVC and Thymeleaf, an HTML template engine. We'll talk about Spring controllers, Thymeleaf template attributes, and connecting the two with the MVC pattern.


- Connecting your Spring app to a database and securing it with Spring Security. We'll cover the basics of ORM and MyBatis, an ORM tool for Java. We'll use the database to store user credentials securely and use them to authenticate users with Spring Security.


- Testing and web browser automation with Selenium. We'll cover how to set up and run tests with JUnit, how a web driver works, and how to simulate user actions in the browser with Selenium. We'll also discuss page objects, Selenium's powerful abstraction tool.



### Lesson 1: Web development in Java

- Java Application Servers: We introduce the basics of server-side web development and how a Java Application Server simplifies things.


- Java Servlets: We discuss the central feature of the Application Server, the Servlet, and how it allows developers to access the conveniences provided by the Application Server.


- Spring Applications: We introduce Spring Framework, a collection of Java libraries and tools that build on the Application Server and Servlet to provide a huge amount of utility to Java web developers.


- Spring Starter Packs: We discuss the various "starter packs" available through Spring Boot's project generator, which can be used to quickly get up and running with a new Spring Boot project configured for specific features.


- Maven and the POM file: We introduce Maven, a dependency management tool for Java that allows developers to easily use powerful open-source libraries in their projects. We discuss how dependencies are declared in Maven's <code> pom.xml </code> file.

### What is a web server

A web server's primary goal is listening for HTTP requests and handling them with application logic sending HTTP response to the client that indicates the result of the oprtations. Simple HTTP servers host directories of HTML files directly, senfing files in their response to requests for specific URLs. This is enough for static websites with no dynamic server operations, but modern web apps support users accounts, complex interactions, and persistent data. Java application servers make these features more accessible by hosting many individual apps, managing them over a common interface, the servlet



## Key Terms

- HTTP: Hypertext Transfer Protocol. A binary protocol that originally defined the mechanics of requesting and sending HTML over the internet. 


- Web Server: A program that listens for and responds to HTTP requests over the internet

- Application Server: A program that hosts other applications, forwarding incoming requests to the appropriate application according to a filter. Provides shared access to resources and multi-threading.


- Pluggable Architecture: A pluggable architecture refers to any piece of software that allows parts of it to be added, replaced, and removed. Usually, this is achieved through a common interface for every "pluggable" component. Sometimes the architecture can even replace components at runtime, as is the case with Servlets in an Application Server. 


- Pluggable Architecture: A pluggable architecture refers to any piece of software that allows parts of it to be added, replaced, and removed. Usually, this is achieved through a common interface for every "pluggable" component. Sometimes the architecture can even replace components at runtime, as is the case with Servlets in an Application Server. 


- Threads/Threading: These terms come from concurrent programming - a thread is essentially one track of computation, and multi-threading is running multiple threads in parallel. This gets a little complicated because your CPU has a limited number of physical cores that can process instructions in parallel, while the number of threads you can have can be many more than your computer has cores, but that's a topic for another time!


https://www.youtube.com/watch?v=S97eKyv2b9M

### Spring 


Spring frameowrk which lies on top of servlet and app services. 

Spring is many things but primarily it is an application framework. 

It is not a library where you choose what api to use/invoke 


Spring uses a inveresion of control


- Spring Ecosystems

Spring's architecture means it's natural to write reusable code!

- There are many tools and libraries in Spring's ecosystem that solve a wide variety of common software development problems

- Inversion of Control:


Spring is an application framework, which means that instead of choosing when to invoke it from your application, you choose when it invokes your application code. This pattern of software development is called Inversion of Control (IoC), and it's powerful because it allows developers to develop specialized application components and use Spring to connect them with each other using dependency injection. This is good for clean, separated code and for code reuse. This is evident when looking at the vast number of Spring modules and Spring-integrated third-party tools that are available. This course focuses on a few of them:



- Spring MVC, a generic web controller library for Spring that supports a wide variety of utilities to simplify the handling of HTTP requests

- Thymeleaf, a third party template engine that can integrate with Spring MVC to simplify the generation of web pages as responses to HTTP requests

- Spring Security, a generic authentication library for Spring that can integrate with many different credential sources and authentication protocols to automatically manage request authentication and security contexts

- MyBatis, a third-party database access library that provides simple SQL/Java mapping tools that can be defined in Spring components



### Project Starter Pack 


Maven: is a dependencyy management system. 

Spring is a collection of open-source libraries that solve common web development problems. But how do we get those libraries? In this course, we'll be using Maven, a dependency management tool that lets us define dependencies on open-source libraries based on their names and version numbers. We define those in a file in our projects called pom.xml, which Maven reads and uses to download the required libraries. We can also have our projects inherit dependencies from some base project, which is a feature that Spring Boot uses to make setting up a new Spring project easy as pie. We'll be using Spring Initializr, an online project generator, to choose specific Spring dependencies to add to new Spring projects.



- Key Terms


MAVEN:  A dependency management system and project build tool for Java. Provides a standardized way to define dependencies between projects and include them in the project build path.


- POM: The Project Object Model that Maven uses to represent the dependency and build configuration of a project. Usually, this refers to the pom.xml configuration file found in a Maven project.


- Dependency Management System: Any tool that automates the downloading and linking of external packages to a software development project. Most languages these days either provide one officially or have a community-accepted standard.







http://www.cse.unsw.edu.au/~cs9242/15/project/index.shtml

### What is Spring? 

As a Spring developer, your responsiblity is to decide what components your application needs.

Every component in a spring app should have a well-defined purpose and set of responsiblites, which should overlap as little as possible


- There are two primary types of Java classes that we need to implement in a spring app


1- Data Type classes: These are simple classes that are used to store/represent complex data

- These classes are created on-demand

2- Components: Components are Persistent services.  These are classes that get created to be managed by the Spring

- These classes are initlized by Spring Startup


### How does Spring implement IoC

- Spring scans your code for components

- Spring initilizes and stores them in the application context


Key Terms:

- Separation of Concerns:

 A code organization philosophy that emphasizes single-purpose components. In Java and Spring, this means keeping all methods related to a specific problem domain in the same class, for the sake of maintainability and reducing code reuse.

- Data Types classes: Sometimes called POJOs (plain-old-java-objects), Data Types are classes in application designed purely to hold structured application data, like users, profiles, or anything else an application might manage. These objects are helpful for us to maintain a good conceptual model of an application, and are created and accessed frequently during execution.

- Components: Components are persistent class instances managed by Spring in an application. They usually resemble libraries more than typical objects, with methods that must be called to perform specific actions. Components are only created when Spring is configured to create them, usually at server startup.

## How does spring implements IoC


- Spring Scans Your Code for Components

- Spring Initilizes and store them in the Application context


### What is an application Context? 

an application context is a a data structure (usually a map) and it can be queried at runtime to find specific components when needed. This is a closed system, so components instantiated outside of Spring won't automatically be injected with dependencies like those instantiated by Spring. Mind the new keyword!

### What is an Closed System? 

Beans in the Application Context are only aware of other beans in the same context. 

### How we should use Spring's IoC implementation

- We need to tell Spring which components our applications needs, and how they depend on one another


- We'll use annotations provided by Spring to configure those components directly in the Java Code. 


### Popular annotations

- <code> @SpringBootApplication </code> tells spring that this is a starting point. The <code> SpringBootApplication </code> is equivalent to three other annotation 

1- <code> @Configuration </code>

2- <code> @EnableAutoConfiguration </code>

3- <code> @ComponentScan</code>

The @SpringBootApplication configures Spring's component scanning and auto-configuration.

- @Configuration 

    It tells Spring that the annotated class includes component definitions for Spring to process. These take the form of @Bean-annotated method whose return values are included as components in the application context. These methods can also take parameters, which act like the dependencies of the components returned by the methods.


### How Spring Processes an IoC Configuration.

Note: Order matters

- A bean without dependencies is initialized first and placed within the application context.


- A service is instantiated by Spring, and the first bean is retrieved from the app context to be injected as a dependency, after which Spring places the service in the application context.


- Finally, another bean is initialized by Spring, which retrieves the previous two components to be injected as dependencies, after which the new bean is placed in the app context, and the application is fully initialized


### Key Terms


- Configuration Files: 
Project files that configure some part of Spring's operation. Some are embedded in Java classes, like we just discussed, and others are  <code>.properties  </code>, <code>.yaml </code>, and  <code>.xml files </code> that we'll discuss later this lesson. Some of them configure the IoC context, like the ones we just discussed, and others configure more abstract pieces of Spring's system.


- Component Annotations: 
Component annotations are annotations that identify application components for Spring to manage. <code>@Bean </code>and <code>@Configuration </code> are examples from the most recent videos, and in the next section we'll discuss <code>@Component</code> and <code>@Service</code> as well.


- Application Context:

 Spring's application context is just a giant data structure that holds all application component instances. It can be queried to gain access to a specified component at runtime, and it's what Spring uses to resolve dependencies.


- Beans:
 
 "Beans" are Spring's name for generic application components, and include any value Spring has stored in the application context. A bean is always either an object or primitive value.


 - Closed System: 
 
 Spring's application context is a closed system, which means that it manages all of the components stored within. It is not possible to instantiate a component manually and still link it fully with Spring - it will never be aware of the components inside of Spring's application context, and vice versa.


 - @Configuration:
  A class annotated with @Configuration is instantiated and managed by Spring as a component, but also as a bean factory. Any methods of the configuration class that are annotated with @Bean are used by Spring to create new beans to add to the application context.

  A configuration annotation has the ability to extend the application context. 

  - <code> @Bean </code>: 
  
  A method annotated with @Bean inside of a configuration class will be used by Spring to generate a bean of the method's return type. This means that the developer can manually configure beans to be included in the application context.


  -<code> @EnableAutoConfiguration </code>:
  
   A class annotated with @EnableAutoConfiguration tells Spring to try to automatically match beans to dependencies based primarily on type. This reduces the need for boilerplate code explicitly identifying individual beans as dependencies.


   - @Primary: 
   This annotation distinguishes the annotated bean method as the default dependency of its type. This is used to resolve conflicts that arise from having multiple bean definitions of the


   - @Qualifier: This annotation distinguishes the annotated bean method or dependency declaration as a qualified bean or dependency. Qualified beans are considered for unqualified dependencies, but only matching qualified beans are considered for qualified dependencies. You can read more about it.


## Key Terms

- Onion Architecture:

 An architectural pattern in which an application is separated into nested layers. In order for a request to be processed by the application, it must first travel through an outer layer of external interfaces and controllers, then through a middle layer of services and business logic, and finally through a persistence layer of data access objects. The separation of these layers emphasizes clean separation of concerns.


 - Application Component:

  In Spring, this is any @Component-annotated class that is instantiated by Spring and placed in Spring's application context. Architecturally speaking, this is a logical unit of an application - a single-purpose library or object that solves a particular problem an application faces. 


- Service: 

In Spring, this is any @Service-annotated class, handled identically to an @Component-annotated class. The difference between the two is semantics - a component is the most generic type of bean, and can be any kind of shared application structure. A service is specifically a collection of library methods that manage one aspect of an application's business logic. For example, a UserService would expose high-level actions related to the users of an application, and an AuthenticationService would expose actions for registering and authenticating a user. Services represent the middle layer of an onion architecture, and should contain the bulk of an application's business logic.

- Repository: 

In Spring, an @Repository-annotated class is treated identically to an @Component-annotated one, but as with @Service, the semantics are different. In an onion architecture, repositories are the inner layer - each repository should act like an interface to a specific set of stored or persistent data. For example, a UserRepository would expose an interface capable of create/read/update/delete and query operations on the users table of the database.


### Spring MVC and Thymeleaf

- MVC and You:

 We introduce the model-view-controller pattern and discuss how Spring MVC adapts it for use on the web.

- HTML Templates and Thymeleaf: 

We look at how Thymeleaf's HTML templates work and how we can populate them with data using Spring controllers.


- Connecting Controllers to Templates:

 We dive deeper into the relationship between controllers and templates to see how to bind data from a web form to a controller method.


 ### Spring MVC

The figure above shows the relationship between Spring MVC and the client. Spring MVC uses HTML templates and application data to render a view for the client browser to display. The view exposes certain actions to the user, which when triggered are sent to Spring MVC, which processes the actions and renders new views for the client.

The figure is in the same file directory. 


### Interacting with a simple web application

In a web application, there are two components: the client that sends HTTP requests, and the server, which sends HTTP responses back. In the case of a web browser client, the responses the server sends need to be in the format of HTML, the document language of the web. The HTML that is sent to the client both defines the data that the user sees, as well as the actions a user can take - things like buttons, links, and input forms are all part of what the server is responsible for generating.

This process of generating an entire UI from HTML would be tedious if we had to do it by hand. Luckily, we don't have to - Thymeleaf is an HTML template engine that, when used with Spring MVC, can simplify things greatly.

### HTML templates

HTML templates are essentially just HTML files with special tags and attributes that can be combined with a data model by a template engine like Thymeleaf to generate fully functional HTML documents. Spring MVC provides a standard way to choose a template and supply the necessary data model when a request comes in, which allows for a truly dynamic user experience.


### Key Terms


- <code >GET </code> Request: an HTTP request for data at a specific URL. This type of request cannot include any additional data.


- <code>  POST </code>Request: and HTTP request that usually represents "posting" new data to the server. This is a common catch-all request method used for many data-bearing requests to the server.

- <code> POST </code> Request: and HTTP request that usually represents "posting" new data to the server. This is a common catch-all request method used for many data-bearing requests to the server.


-  <code> Dynamic </code>: Something that is dynamic changes in response to external stimuli. In the case of HTML templates, dynamic sections of the template are ones that can be replaced or configured with data on-demand.


- <code> Static </code>: Something that is static does not change. In the case of HTML templates, static sections of the template are the ones that cannot be changed and will be the same no matter what data is used with the template.


### BAsic Interactions


- User Navigates to the App for the first  time.


- User Navigates within the app (to different View)


- Userr submits Data through a form ti the App



### Spring MVC 

MVC is an acronym that stands for Model-View-Controller, and it's a common software pattern for user interface design. Traditionally, it divides the roles of components in an app into three layers:

- Model, which is responsible for maintaining the state of an application,

- View, which is responsible for displaying the UI to the user,

- Controller, which is responsible for processing user actions (sent from the View) to update the Model, and for forwarding those updates back to the View

MVC is an abstract pattern, though, and every library implements it differently. Spring MVC is built around the browser as a platform, and it organizes these roles like this:



- HTML templates are the views - each one represents a specific screen or screen component that the user is shown.