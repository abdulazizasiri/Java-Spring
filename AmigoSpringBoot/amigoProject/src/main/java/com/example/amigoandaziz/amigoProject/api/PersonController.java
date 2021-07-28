package com.example.amigoandaziz.amigoProject.api;

import com.example.amigoandaziz.amigoProject.model.Person;
import com.example.amigoandaziz.amigoProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@Valid @NotNull @RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getPeople(){ // You do not call it explicitly.
       return  personService.getPeople(); // Will get bck to the
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable UUID id){
        return personService.getPersonById(id);
    }

    @DeleteMapping(path = "{id}")
    public int deletePersonId(@PathVariable UUID id) {
        return personService.deletePerson(id);
    }

    @PatchMapping(path = "{id}")

    public int uupdatePersonById(@PathVariable UUID id,@Valid @NotNull  @RequestBody Person person) {
        return personService.updatePersonByID(id, person);
    }


}
