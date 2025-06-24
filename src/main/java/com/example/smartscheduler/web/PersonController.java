package com.example.smartscheduler.web;


import com.example.smartscheduler.model.Person;
import com.example.smartscheduler.repo.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/**
 * *******************************************************
 * Package: com.example.smartscheduler.web
 * File: PersonController.java
 * Author: Ochwada
 * Date: Tuesday, 24.Jun.2025, 3:14 PM
 * Description:
 * Objective:
 * *******************************************************
 */

@RestController
@RequestMapping("/people")
public class PersonController {


    /**
     * Repository for accessing and managing Person entities
     */
    private final PersonRepository repository;

    /**
     * Constructor for injecting the {@link PersonRepository}.
     *
     * @param repository the person repository to be injected
     */
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    /**
     * Creates and saves a new {@link Person} to the database.
     *
     * @param person the {@link Person} object received from the request body
     * @return the saved {@link Person} entity with a generated ID
     * @RequestBody is a Spring annotation that tells the framework to:
     * - Convert the HTTP request body into a Java object
     */
    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }


    /**
     * Retrieves a {@link Person} by their unique ID.
     *
     * @param id the ID of the person to retrieve
     * @return an {@link Optional} containing the {@link Person} if found, or empty if not
     */
    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable("id") Long id) {
        return repository.findById(id);
    }
}
