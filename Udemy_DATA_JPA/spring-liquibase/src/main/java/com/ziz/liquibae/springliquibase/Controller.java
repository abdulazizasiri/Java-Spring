package com.ziz.liquibae.springliquibase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class Controller {
  @Autowired
  private PersonRepository personRepository;

  Controller(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }
  @PostMapping
  public String createPerson(@RequestParam String name) {
    Person pp = new Person(name, 5.75);
//    Optional<String> foundNAme = this.personRepository.findByName(name);
//    System.out.println("Was name found "+foundNAme.orElse("Was not found"));
    this.personRepository.save(pp);
    return name + " Was saved Succesffully";
//    personRepository.save(new Person(name, 5.8));
//    return personRepository.findByName(name) + "Saved Success";
  }

  @GetMapping
  public List<Person> getAllPersons(){
    return (List<Person>)personRepository.findAll();
  }
}
