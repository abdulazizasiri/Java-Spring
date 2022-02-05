package io.azizasiri.jparelationships.JPA.Relationships.subject;


import io.azizasiri.jparelationships.JPA.Relationships.student.Student;
import io.azizasiri.jparelationships.JPA.Relationships.teacher.Teacher;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
// Subject will have one student
// Subject will have many students
@Entity
public class Subject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  private String name;

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "teacher_id", referencedColumnName = "id")
  private Teacher teacher;

  public Teacher getTeacher() {
    return teacher;
  }

  public Set<Student> getEnrolledStudents() {
    return enrolledStudents;
  }
//  @ManyToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "teacher_id", referencedColumnName = "id")
//  private Teacher teacher;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  // This shoudl be in a controller.

  public Set<Student> getEnrolledStudent() {
    return enrolledStudents;
  }



  @ManyToMany
  @JoinTable(name = "student_enrolled",
  joinColumns = @JoinColumn(name = "subject_id"),
  inverseJoinColumns = @JoinColumn(name = "student_id"))
   Set<Student> enrolledStudents = new HashSet<>();





}
