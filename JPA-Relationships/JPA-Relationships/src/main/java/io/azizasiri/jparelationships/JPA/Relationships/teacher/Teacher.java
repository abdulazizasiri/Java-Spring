package io.azizasiri.jparelationships.JPA.Relationships.teacher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.azizasiri.jparelationships.JPA.Relationships.subject.Subject;
//import com.kriscfoster.school.subject.Subject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

//  @JsonIgnore
//  @OneToMany(mappedBy = "teacher")
//  private Set<Subject> subjects;

  // One teacher can have many subjects

  @JsonIgnore
  @OneToMany(mappedBy = "teacher") // This is a field
  private Set<Subject> subjects = new HashSet<>();


  private String name;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Subject> getSubjects() {
    return this.subjects;
  }

}
