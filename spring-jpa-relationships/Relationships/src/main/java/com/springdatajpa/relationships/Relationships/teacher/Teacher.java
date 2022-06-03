package com.springdatajpa.relationships.Relationships.teacher;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springdatajpa.relationships.Relationships.course.Course;

import javax.persistence.*;
import java.nio.file.attribute.AclEntryType;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    // Teacher Can teach many Courses
    //  One teacher can teach multiple courses
    @JsonIgnore
    @OneToMany(mappedBy = "teacher") // One from within this
    Set<Course>  teachingCourses = new HashSet<>();

    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
