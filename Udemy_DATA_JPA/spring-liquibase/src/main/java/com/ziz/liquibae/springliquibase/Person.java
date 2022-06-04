package com.ziz.liquibae.springliquibase;


import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long id;
  @Column(name = "name")
  private String name;

  @Column(name = "height")
  private double height;

  public Person( String name, double height) {
    this.name = name;
    this.height = height;
  }

  public Person() {
    // For persistence
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
