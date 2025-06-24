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

#### ✅ Task 5️⃣: Create the Person Entity
- Create a class to represent a person with:
  - An ID (auto-generated)
  - A name (String)
- Use JPA annotations to map it to a database table. 
- Add a no-args constructor and getters/setters.

#### ✅ Task 6️⃣: Create the PersonRepository
- Create a repository interface for the Person entity. 
- Extend the appropriate Spring Data interface to get built-in CRUD methods.

#### ✅ Task 7️⃣: Create the REST Controller
- Create a REST controller class to handle HTTP requests. 
- Add endpoints to:
  - Create a new person (POST)
  - Get a person by ID (GET)
- Inject the repository using constructor injection.

#### ✅ Task 8️⃣: Configure application.properties
- Configure H2 as the database. 
- Enable the H2 web console. 
- Set up JPA to automatically create/update the schema. 
- Enable SQL output to see what JPA is doing.

#### ✅ Task 9️⃣: Run and Test the Application
- Start the application. 
- Use Postman (or curl) to:
  - Create a person by sending a POST request with JSON. 
  - Retrieve a person by sending a GET request with the ID. 
- Open the H2 console in your browser to view the data table.

#### ✅  Submission :
- Share screenshots of the Postman tests 
- Take a screenshot of the H2 console 
- Push your project to GitHub 
- Submit a short video walking through your code and endpoints