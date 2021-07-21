package com.example.amigoandaziz.amigoProject.service;

import com.example.amigoandaziz.amigoProject.dao.PersonDao;
import com.example.amigoandaziz.amigoProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonDao personDao ;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
