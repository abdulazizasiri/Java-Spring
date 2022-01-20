package com.dailycodeBuffer.springdatajpatutorial.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email_id", nullable = false)
    private String emailId;
    @Column(name = "guardian_name", nullable = false)
    private String guardianName;
    @Column(name = "guardian_email", nullable = false)
    private String guardianEmail;
    @Column(name = "guardian_phone", nullable = false)
    private String guardianMobileNumber;
}
