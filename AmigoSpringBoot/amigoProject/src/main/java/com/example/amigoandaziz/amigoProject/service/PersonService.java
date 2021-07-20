package com.example.amigoandaziz.amigoProject.service;

import com.example.amigoandaziz.amigoProject.dao.PersonDao;
import com.example.amigoandaziz.amigoProject.model.Person;

public class PersonService {

    private PersonDao personDao ;


    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
