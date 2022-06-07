# Liquibase

### What is Migration? 

- Migrations are the process of moving programming code from one system to another.


- This is fairly large and complex topic of maintaing computer applications


- Database migrations typically need to occur prior to, or in conjucntion with application code. 

- can lead to run time errors if database does not match what is expected


- Database migrations are a very important part of the process of moving your application code to production. 


- Keep in mind, in large organizations, you as the developer will not be doing the migration. 


### Why Use a migration tool? 

= Hibernate can manage my schema fine, why use a migration tool?

    - Mangaing many environemnets and databases:
        - Dev (H2), CI/CD, QA, UAT, Production
    
    - Development and CI/CD databases are easy, just rebuild each time.

    - QA, UAT, prodcution are permanent databases

        - What states are they in?
        - Has a script been applied?
        - How to create a new database to a release?
    

### The why?

    - Database Migration tools can:

        - Create a new database
        - Hold history of migrations
        - Have a reproduciable state of the database
        - Help Manage changes being applied to numerous database instances

    - Popular open source database migrations Tools:

        - Liquibase
        - Flyway
    
    - Common Features between Flyway and Liquibase

        - Command Line Tools
        - Integeration with maven and Gradle
        - Spring Boot Integeration
        - Use a script files which can be versioned and tracked
        - Use Database table to track changes
        - Have a commercial support. 

- Spring Boot offers support for both liquibase and Flayway.      

- Fundementally Spring boot will apply change sets

- Spring Boot's support is narrow in scope

- Both tools have additional capabilities available from the CLI

- The Spring boot integeration is convenient for migrations

    - Both tools may be used independently of Spring Boot

- Liquibase and Flayway are very similar in terms of functionallity

- Share same concepts, slightly different terminology

- Liquibase supportd change scripts in SQL, XML, YAML, and JSON

    - XML, YAML adn JSON abstract SQL which may be beneficial for different DB technologies


- Flaway supports SQL and JAVA only

- Liquibase is a larger and more robust product

- Flayway seems to have more popularity

- Both are mature and widely used. 


### Which one to use 


- Liquibase is probably a better solution for large enterprises with complex enviornment

- Flayway is good for 90% of applicationa which don't  need the additional capabilities 

- Recommendations

    - If one or the other is being used in the organization, use it.


    - If in doubt, do your research on each option.

    - John's preference is Flayway - simple and easy to use. 


## Liquibase Terminiolgy 


- ChangeSet - A set of changes to be applied to the database.

- Change - A single change to be applied to the database


- ChangeLog - A file which has a list of changeSet's to be applied. 

 - PreCondition - Conditions which control the execution


 - ChangeLog Parameters - Placeholders which can be replaced at run time. 



### Liquibase best practices


- Organazing Change Losgs - Create a naster change  log to organize Change Sets



- One Change Per Change Set - Allows for rasier roolback If there is a failuer 


- Never Modify a change set - Changes should be additive 

- USe Meaningful Change Set Ids - Some  use a sequence number, others use a descriptive name. 


### File structure of 


---------------------------------------------------------------------------------------------------------

Youtube: Liquibase 


---------------------------------------------------------------------------------------------------------


### Terminology 


- Changeset: describes a set of changes that liquibase executes within one transaction. 

To enable successful rollbacks and keep track of the executed changesets, each changeset is identified by Author name and an id. 




### Flyway: Terminology 


- Migrate - Migrate to latest version

- Clean - Drops all databases objects - NOT FOR PRODUCTION USE

- Info - Prints info about migration 

- Validate - Validates applied migrations against available 

- Undo - Reverts most recentely applied migration

- Baseline - Baseline an existing database

- Repair - Used to fix problems with schema history table. 

## Running Flyway CLI 

CLI available for windows, MacOS, and Linux.

    - Not covered in this course -- :(

 Maven / Gradle Plugins 

     - Not covered in this course -- :(

Spring Boot - Will run flyway on startup to update configured database to latest changeset. 


### 




