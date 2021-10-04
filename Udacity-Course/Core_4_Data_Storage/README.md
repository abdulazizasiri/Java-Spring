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


### Data Transfer Objects (DTOs)

Data structures designed to represent the needs of the front end.


- DTO Summary

    Simplify and document interaction between front end and Controller.

    Conceal database structures.

    Limit the amount of data exchanged.

    Customize display data to meet the needs of the front end.



### JSONView


### @JSONView Summary

- Quickly specify which parts of Entities should be visible to which consumer.

- Often a simple choice when controlling full stack.

- Not as helpful when you need to combine data from multiple Entities.

- Can require Entity updates if front end needs change.

- Often grouped together in a Views class, containing interfaces such as ‘Public’, ‘Private’, or interfaces named for specific endpoint recipients.



### Lesson Outline

- Value vs. Entity types

- BasicTypes in Java and JDBC

- Identifiers

- Relationships

- Inheritance

### Single Table Inheritance 

- Inheritance vs Composition

1- Compositions: Objects are related because one of them 'has-a' reference to the other one.

2- Inheritance: Objects are related because one of them 'is-a' type of the other one. 


### Lesson Outline

- Persistence Context

- Entity Manager

- Queries and JPQL

- Projections

- Repository Pattern

- Spring Data JPA

- Transactions and Flushing


### Definitions

- Java Persistence API (JPA): A specification describing how to manage relational data

- Hibernate: An implementation of the JPA Specification


### Persistence Context


Persistence Context: Describes the relationship between all the Entity instances in our program and their representations in the underlying database.

Instance: A specific copy of an Entity in program memory.


- Persistence Context Entity States


- Transient: not associated with the persistence context. Often has not yet had an ID assigned.

- Managed: persistent. Managed by the current persistence context. Changes to the entity will be reflected in the backing database.

- Detached: previously managed. Occurs to all managed entities when persistence context ends.


- Removed: scheduled to be removed from the database. Java object still exists and has ID.


### Entity Manager

We use the entity manager to change Persistence states


- Persist: Takes an Entity not yet managed. The Entity becomes managed and will be saved to the database.

- Find: Looks up an id in the database and returns a managed Entity.

- Merge: Updates an Entity that is in the detached state. Returns an instance of that Entity that is now managed. If Entity was not found in the database to update, persists Entity as a new row.

- Remove: Detaches an entity and deletes it from the database.


Code the shows some methods that manipuoate the context. 


```java

@PersistenceContext
EntityManager entityManager;

public void persistExample(Person p) {
   entityManager.persist(p); //write p to the database
   p.setFavoriteComposer("Johann Strauss II"); //will update database
}

public void findExample(Long id) {
   Person p = entityManager.find(Person.class, id); //retrieve an instance by its key
   p.setFavoriteComposer("Sir Malcolm Arnold"); // will update database
}

public void getReferenceExample(Long personId, Long outfitId) {
   Person p = entityManager.find(Person.class, personId);
   Outfit outfitReference = entityManager.getReference(Outfit.class, outfitId);
   p.getOutfits().add(outfitReference);
}

public void mergeExample(Person detachedPerson){
   detachedPerson.setFavoriteComposer("Rimsky Korsakov");
   Person managedPerson = entityManager.merge(detachedPerson);
   detachedPerson.setFavoriteComposer("Antonio Salieri"); //will have no effect on database
   managedPerson.setFavoriteComposer("C.P.E. Bach"); //will overwrite Korsakov
}

public void deleteExample(Long id) {
   Person p = entityManager.find(Person.class, id); //retrieve an instance by its key
   entityManager.remove(p); //will delete row from database
}

```
### Lazy Loading

- FetchType.LAZY

    Wait to retrieve associated values until they are referenced. Lazy-loaded attributes are Hibernate proxy objects whose specific values are retrieved from the database only if they’re accessed. The initial query for the entity will NOT retrieve this data.

- FetchType.EAGER
    
    Always retrieve the associated values as part of the Entity retrieval. This means the initial query for the entity retrieves this data.


- By default, Fetch types

<code> FetchType.LAZY: </code>

1- @OneToMany

2- @ManyToMany

<code> FetchType.EAGER: </code>

1- @ManyToOne

2- @OneToOne


## Cascading Persistence Operations



### Querying: JPQL




### Repository Pattern

The Repository annotation identifies components in Spring that interact with the database. 

Repository pattern is a way of thinking about your database as a collection of objects.

### Spring Data JPA 


interfaces the implments CrudRepository



### 


- Definitions

- Flushing: The process of synchronizing the state of the persistence context with the underlying database.

- Transaction: A set of operations that either succeed or fail as a group.

- Level 1 Cache: The Persistence Context functions as a Level 1 Cache, because it does not write changes to the database until Flushing occurs.


### Flushing Triggers

- Transaction Ends

- Query overlaps with queued Entity actions

- Native SQL Query executes without registering affected Entities

- Transactions

    If we execute multiple persistence operations, a failure on one could leave the Database in an inconsistent state. By wrapping multiple operations in a Transaction, no changes will be applied unless all operations succeed.
    A good practice is to start one Transaction for each request that interacts with the database. The simplest way to do this in Spring is through the @Transactional annotation. You can annotate methods to begin a transaction when the method starts and close it when you leave. You can also annotate classes to treat all their methods as @Transactional. This annotation is best done at the Service layer, so a new transaction is started whenever the Controller classes request operations that may involve the database.




### End


- Lesson Outline

- Persistence Context

- Entity Manager

- Queries and JPQL

- Projections

- Repository Pattern

- Spring Data JPA

- Transactions and Flushing