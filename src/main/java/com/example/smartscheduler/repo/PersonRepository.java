package com.example.smartscheduler.repo;


import com.example.smartscheduler.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * *******************************************************
 * Package: com.example.smartscheduler.repo
 * File: PersonRepository.java
 * Author: Ochwada
 * Date: Tuesday, 24.Jun.2025, 3:07 PM
 * Description:
 * Objective:
 * *******************************************************
 */

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    // No need to write any code - CRUD methods are inherited:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - count()
}
