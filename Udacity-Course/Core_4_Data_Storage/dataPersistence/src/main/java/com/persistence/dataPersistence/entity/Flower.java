package com.persistence.dataPersistence.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "plant")
public class Flower {
    @Id
    @GeneratedValue

    private Long id;

    @Nationalized // should use @Nationalized instead of @Type=nstring
    private String name;
    private String color;
    @Column(precision=12, scale=4)
    private BigDecimal price; // BigDecimal is the standard Java class for currency math

    /* getters and setters*/
}