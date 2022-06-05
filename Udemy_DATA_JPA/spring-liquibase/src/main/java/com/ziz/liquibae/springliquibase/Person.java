package com.ziz.liquibae.springliquibase;


import javax.persistence.*;


@Table(name = "persons")
@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private  Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "height")
  private double height;


  @Column(name = "age")
  private int age;


  @Column(name = "address")
  private String address;

  @Column(name = "education")
  private String education;
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Person(String name, double height) {
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
