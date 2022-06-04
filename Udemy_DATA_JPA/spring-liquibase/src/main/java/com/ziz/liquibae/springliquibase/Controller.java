package com.ziz.liquibae.springliquibase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {
  @Autowired
  private PersonRepository personRepository;
  @PostMapping
  public String createPerson(@RequestParam String name) {
    personRepository.save(new Person(name, 5.8));
    return personRepository.findByName(name) + "Saved Success";
  }

  @GetMapping
  public List<Person> getAllPersons(){
    return (List<Person>)personRepository.findAll();
  }
}
