package com.example.smartscheduler.model;


import jakarta.persistence.*;

/**
 * *******************************************************
 * Package: com.example.smartscheduler.model
 * File: Person.java
 * Author: Ochwada
 * Date: Tuesday, 24.Jun.2025, 2:55 PM
 * Description: Represents a Person entity with an auto-generated ID and a name.
 * Objective:
 * *******************************************************
 */

@Entity
public class Person {

    /** Auto-generated unique identifier for each person. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /** The person's name. */
    private String name;

    /** Default constructor required by JPA. */
    public Person() {
    }

    /** Getters and Setters.*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
