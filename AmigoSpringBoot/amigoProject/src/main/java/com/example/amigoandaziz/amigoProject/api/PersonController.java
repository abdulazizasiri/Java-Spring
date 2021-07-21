package com.example.amigoandaziz.amigoProject.api;

import com.example.amigoandaziz.amigoProject.model.Person;
import com.example.amigoandaziz.amigoProject.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
