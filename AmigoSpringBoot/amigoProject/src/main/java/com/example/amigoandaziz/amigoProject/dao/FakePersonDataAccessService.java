package com.example.amigoandaziz.amigoProject.dao;

import com.example.amigoandaziz.amigoProject.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService  implements PersonDao {
    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public Person selectPersonById(UUID id) {
        return null;
    }

//    @Override
//    public Person selectPersonById(UUID id) {
//        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
//    }

    @Override
    public int deletePersonById(UUID id) {
        var success = DB.removeIf(person -> person.getId().equals(id));
        if (success){
            return 1;
        }
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
       Person p1 =  DB.stream().filter(p ->
                p.getId().equals(id)).findFirst().orElse(null);

       if (p1 != null) {

           int x = DB.indexOf(p1);
           DB.set(x, person);
           return 1;
       }
        return 0;
    }

}
