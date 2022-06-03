package com.springdatajpa.relationships.Relationships.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springdatajpa.relationships.Relationships.student.Student;
import com.springdatajpa.relationships.Relationships.teacher.Teacher;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    // Many to many
    @ManyToMany
    @JoinTable(name = "student_enrolled",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> enrolledStudents = new HashSet<>();

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

  public void setEnrolledStudents(Set<Student> enrolledStudents) {
    this.enrolledStudents = enrolledStudents;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "teacher_id", referencedColumnName = "id")// What does this mean in plain english?
  private Teacher teacher ;

  private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
      this.enrolledStudents.add(student);
    }

  public void assignTeacherToCourse(Teacher teacher) {
      this.teacher = teacher ; // Setter is better
  }
}
