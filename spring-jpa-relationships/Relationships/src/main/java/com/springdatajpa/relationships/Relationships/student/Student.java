package com.springdatajpa.relationships.Relationships.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springdatajpa.relationships.Relationships.course.Course;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Course> courses = new HashSet<>();



    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

}
