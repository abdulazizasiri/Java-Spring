package com.example.amigoandaziz.amigoProject.dao;

import com.example.amigoandaziz.amigoProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService  implements  PersonDao{
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int insertPerson(Person person) {
        String query = "INSERT INTO person (id, name), VALUES (?, ?)";
        jdbcTemplate.query(query, new Object[]{UUID.randomUUID(), person.getName()}, (resultSet, i) -> {
//            UUID personId = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(UUID.randomUUID(), name);
        });
        return 0;
    }

    @Override
    public List<Person> getAllPeople() {
        final String q  = "SELECT id, name FROM person;";
        return jdbcTemplate.query(q,  (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(id, name);
        });


    }

    @Override
    public Person selectPersonById(UUID id) {
        final String q  = "SELECT id, name FROM person WHERE id = ?;";
        Person p =  jdbcTemplate.queryForObject(q,  new Object[]{id},(resultSet, i) -> {
            UUID personId = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(personId, name);
        });
         return p;

    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
