### Web Service and APIs

Web services, APIs, and microservices

- Web services are designed to communicate with other services, or programs. 


###  Web services and API overview

A web service is a way to share data between two disparate systems. The communication typically happens between a client and a server.


Client - The client makes a request for data.
Server - The server responds to the client's request.


The means of communication between the client and server is via a standard web protocol like HTTP (or HTTPS) on the world wide web, that uses a common language like JSON or XML.

A client invokes a web service by sending an XML (or JSON) message, then waits for a corresponding XML response from the server.


### Web service vs API vs microservices

APIs and microserrvices are evloutions of WS

### REST 

REST stands for REpresentational State Transfer. It’s a set of guidelines application developers use to design APIs.


- Data and functionality in the API are considered “resources” and identified through something called the URI, or Uniform 
Resource Identifier. These are accessed by web links.

- Resources are manipulated using a fixed set of operations. GET retrieves a resource. POST creates one. Use PUT to update the resource, and of course, DELETE will remove it.

- Resources can be represented in multiple formats, such as HTML, XML, plain text, and other formats defined by a media type.

- Communication between the client and server (i.e. endpoint) is stateless. This means the server will not remember or store any state about the client that made the call.


The REST API has the following components:

- Controller - LocationController.java

- Service - LocationService.java and LocationServiceImpl.java

- CRUD Repository - LocationRepository.java

- Domain Entity/Model - Location.java

- H2 Database accessible via http://localhost:8080/h2/

- Tomcat Server accessible via http://localhost:8080


### Graphql 


- It is a query language for APIs


- Describes how to ask for Data

- The benefits of it is that it lets the client specifies what it needs exactly



### Schemas 

The schema has the following


- Defines data points

- Data types

- Relationships


- Operations


- Queries and mutations 

Example of a schema:


```js 

type Location {
 id: ID!
 name: String!
 address: String!
}

type Query {
 findAllLocations: [Location]!
}

type Mutation {
 newLocation(name: String!, address: String) : Location!
 deleteLocation(id:ID!) : Boolean
 updateLocationName(newName: String!, id:ID!) : Location!
}


```

### Adding Graphql dependency 

There are some dependency that have to be added manuelly to the Pom file.

```xml

<dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>

        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-java-tools</artifactId>
            <version>5.2.4</version>
        </dependency>

        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>

```
We will have a different project structure as follows:

1- entity

2- exceptions

3- mutator

4- respositry

5- resolver

6- service

7- controller 


- We may also add the following to the projeect in the propert file


```java 


spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:mem:dogdata

graphql.servlet.mapping=/graphql
graphql.servlet.enabled=true
graphql.servlet.corsEnabled=true

graphiql.enabled=true
graphiql.endpoint=/graphql
graphiql.mapping=graphiql

```



### Microservices

Microservices architecture (MSA) dividedthe/decomposes services into discrete individual standalone components that can communicate among themselves working together orwith exterenal systems.

MSA benefits:


1- Agile framework

2- Flexiable due to language support and ccommunication

3- Easy to write,test, deploy and share

4- Scale to load and demand

5- Resilienct systems


### Characteristics

- Scope of the interface

- Single purpose

- Simple interface 

- Modular and independent

- Isolated persistence


### Eureka

The first part in having microservice development is to first have a service registry. 

Eureka is an open source service registry that Netflix has created and made open source.

Spring has incorporated Eureka into Spring Cloud, making it even easier to stand up a Eureka server.

Eureka consists of a server and a client-side component. The server component will be the registry in which all the microservices register their availability. The microservices use the Eureka client to register; once the registration is complete, it notifies the server of its existence.


### Features

<code> Spring data rest </code> : 

- makes it easy to expose microservices

- No tedious boilerplate code

- No need for @RestController  and @RequestMapping

- SDR (in short for Spring data rest), is built on top of Spring Data Repositories


- Export as REST resources

### How it works (SDR)

- When the application starts up, it locates all Spring data repositories

- It creates an endpoint that matches the entity name



- Append an 'S' in the entity name

- Automatically exposes CRUS operations as restful apis over HTTP


In a nutshell, 


So how does Spring Data Rest work?

1- At application startup, Spring Data Rest finds all of the spring data repositories

2- Then, Spring Data Rest creates an endpoint that matches the entity name

3- Next, Spring Data Rest appends an S to the entity name in the endpoint

4- Lastly, Spring Data Rest exposes CRUD (Create, Read, Update, and Delete) operations as RESTful APIs over HTTP



### REST Security 

- Authentication

Authentication is about validating the identity of a client attempting to call a web service. Typically, identity is validated with user credentials, such as a user name and password.

- Authorization

Authorization is the next step after authentication. So once a client is authenticated (they have proven who they are), what do they have access to? For example, what data can they view, are they allowed to change that data, etc.



### Basic Authentication 

- Simple protocol for authentication

- Requires a username and password

- Single Base 64-encoded  value: 

- Server compares: IF checked, then

- Approves or denies access


### REST



### SOAP



## Documentations 


One of the popular API documentation specification is <code> OpenAPI </code> formally known as the Swagger specifications

OpenAPI allows: 

1- Descibe our API using JSON or YAML 

2- Describe avaliable endpoints

3- Operations with parameters

4- Authentication methods

5- Contact info about your API

- Swagger: allows us to

1- Design, build, document, consume REST APIs

2- SpringFX is a swagger integeration for the Spring Framework

- Swagger parts

1- Swagger Editor

2- Swagger UI


### final project

