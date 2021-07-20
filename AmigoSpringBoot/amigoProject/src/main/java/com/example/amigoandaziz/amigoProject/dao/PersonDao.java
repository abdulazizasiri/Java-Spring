package com.example.amigoandaziz.amigoProject.dao;

import com.example.amigoandaziz.amigoProject.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person) ;
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
