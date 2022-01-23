package com.dailycodeBuffer.springdatajpatutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email_address"
))
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "student_sequence")
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email_address", nullable = false)
    private String emailId;
    @Column(name = "guardian_name", nullable = false)
    private String guardianName;
    @Column(name = "guardian_email", nullable = false)
    private String guardianEmail;
    @Column(name = "guardian_phone", nullable = false)
    private String guardianMobileNumber;
}
