package com.example.amigoandaziz.amigoProject.service;

import com.example.amigoandaziz.amigoProject.dao.PersonDao;
import com.example.amigoandaziz.amigoProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    private PersonDao personDao ;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> getPeople(){
        return personDao.getAllPeople();
    }

    public Person getPersonById(UUID  id) {
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDao.deletePersonById(id);
    }

    public int updatePersonByID(UUID id, Person p) {
        return personDao.updatePersonById(id, p);
    }


}
