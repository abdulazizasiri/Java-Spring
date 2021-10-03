### Data Sources in Spring 


### We'll be using the following tools:

IntelliJ IDEA
Maven
Git
MySQL
Postman


### Course Outline


- Data in a multitier Architecture

- Java Persistence API

- Connecting to Data Sources

- Persistence without JPA

### Data in a multitier Architecture

We will start with entity design first. 


Entities are used to negotiate between:

- The object representation of data in Java.

- The table representation of data in a database.


### Entity Design Overview

- First thing, We need to ask, what are trying to model in our app? 

- Note

- Java Persistence API (JPA)

A specification describing how to manage relational data.

- Hibernate

An implementation of the JPA Specification. You can access Hibernate’s documentation page here.


## Lesson Outline

- Value vs. Entity types

- BasicTypes in Java and JDBC

- Identifiers

- Relationships

- Inheritance


## What are entities? 

Entities are java objects that contains a collection of data and defines a relationship with the database. 

POJO: "plain Old Java Object", A java object that contains data, but no methods that describe behavior

Value Type: A Piece of data inside an Entity that represent a single value. 


Note: Each entity type represent a table in the database and each value type represent a column in that database. 


- We have to provide a <code> public no no argument constructor </code> to the entity If you created any kind of an argument constructor in the entity. IF you don't create your own argument constructor java will create one for you. 


Basic Types
Basic Types map a single database column to a single, non-aggregated Java type. Here are some examples of basic types:

Java	                JDBC	    Hibernate type	        Registry Key
java.lang.String	    VARCHAR	    StringType	                string
java.lang.String	    NVARCHAR	StringNVarcharType	        nstring
int, java.lang.Integer	INTEGER	    IntegerTypes	            int
long, java.lang.Long	BIGINT	    LongType	                long


- Identifiers


Valid identifier types are:

- Any Java primitive type

- Any primitive wrapper type (like Long, or Boolean)

- A String

- java.sql.Date or java.util.Date

- java.math.BigDecimal or java.math.BigInteger


### Relationships

- Types of Entity Associations

- OneToOne: Single Entity on each side of the relationship.

- OneToMany and ManyToOne: List of Entities on one side, single Entity on the other.

- ManyToMany: Lists of Entities on both sides.


Code that shows a one to many relationship

```java 

@Entity
public class Person {
   @Id
   @GeneratedValue
   private Long id;

   @OneToMany
   private List<Outfit> outfits;

   /* rest of class */
}

@Entity
public class Outfit {
   @Id
   @GeneratedValue
   private Long id;

   /* rest of class */
}



```