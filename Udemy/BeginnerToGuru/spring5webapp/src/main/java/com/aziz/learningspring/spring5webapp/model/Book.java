package com.aziz.learningspring.spring5webapp.model;

import javax.persistence.ManyToMany;
import java.util.Set;

public class Book {
    private String title;

    public Book(String title, String isbn, Set<Author> authorSet) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authorSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    private String isbn;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    //  No arg constructor is required in JPA
    public Book() {
    }
}
