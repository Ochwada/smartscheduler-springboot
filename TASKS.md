# Project Tasks

## Student Assignment: Build a Spring Boot Project from Scratch

### 🎯 Project Goal
Create a Spring Boot REST API from scratch (without Spring Initializer) that:
- Manages a list of people (with a name).
- Allows creating and retrieving people via HTTP.
- Stores data in an H2 in-memory database.
You’ll **build the entire app manually**, configure Maven, and test it using Postman or browser.


### 🗒️ Task List
#### ✅ Task 1️⃣: Create a Maven Project in IntelliJ IDEA
- Create a new project using Maven (not Spring Initializer). 
- Set `GroupId`, `ArtifactId`, and project name (e.g. `smart-scheduler`). 
- Choose Java 17 or later. 
- Finish and open the project.

#### ✅ Task 2️⃣: Configure the pom.xml
- Add the **Spring Boot starter parent**. 
- Declare dependencies for:
  - Spring Boot Web (REST)
  - Spring Data JPA 
  - H2 Database 
- Set Java version. 
- Add description and Spring Boot Maven plugin.

#### ✅ Task 3️⃣: Create the Package Structure
- Create a package structure like this inside `src/main/java`:
```
com.example.smartscheduler
  ├── model
  ├── repo
  ├── web
```
- Each package has a specific responsibility:
  - `model`: Data classes (entities)
  - `repo`: Data access layer 
  - `web`: REST controller(s)

#### ✅ Task 4️⃣: Create the Main Application Class
- Create the main class with the main() method. 
- Annotate the class to mark it as a Spring Boot application. 
- Add a method that runs once at startup and adds sample data.