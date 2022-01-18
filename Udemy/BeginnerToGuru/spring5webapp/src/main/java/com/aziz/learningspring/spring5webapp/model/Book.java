package com.aziz.learningspring.spring5webapp.model;

import java.util.Set;

public class Book {
    private String title;
    private String isbn;
    private Set<Author> authorSet;

    //  No arg constructor is required in JPA
    public Book() {
    }
}
