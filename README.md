# Contact book backend

I decided to complete this project for my first-year internship at the Canary Islands Institute of Technology, 
as I've been asked to learn backend development for the first time. The topic I chose is a contact book.

## Built with

* [![SpringBoot][SpringBoot]][SpringBoot-url]

## Prerequisites

* [JDK 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
* [Maven](https://maven.apache.org/download.cgi)
* [MySQL Community 8.x](https://dev.mysql.com/downloads/)

## Running the project

### Configuration database connection

The first step is to change the contents of the *src/main/resources/application.properties* file by changing the
following properties:

    ...
    spring.datasource.username=<database-username>
    spring.datasource.password=<database-password>
    ...

### Create database 

To create the database with its tables and properties, it is necessary to execute the .sql 
file in *sql/createEmptyDatabase.sql* and if test data is required for development we will execute 
the *sql/fillDevData.sql* file

### Run the Spring Boot project

You can run the project with the next command:

    mvn spring-boot:run

But if you are using an IDE like [IntelliJ](https://www.jetbrains.com/idea/download///?section=windows), these come with configurations to be able to start a Spring boot project.






[SpringBoot]: https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white
[SpringBoot-url]: https://spring.io/projects/spring-boot