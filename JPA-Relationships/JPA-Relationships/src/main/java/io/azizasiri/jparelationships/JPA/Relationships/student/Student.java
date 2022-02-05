package io.azizasiri.jparelationships.JPA.Relationships.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.kriscfoster.school.subject.Subject;
import io.azizasiri.jparelationships.JPA.Relationships.subject.Subject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  private String name;

//  @JsonIgnore
//  @ManyToMany(mappedBy = "enrolledStudents")
//  private Set<Subject> subjects = new HashSet<>();

  @JsonIgnore
  @ManyToMany(mappedBy = "enrolledStudents")
  private Set<Subject> subjects = new HashSet<>();

  public Set<Subject> getSubjects() {
    return subjects;
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



}
