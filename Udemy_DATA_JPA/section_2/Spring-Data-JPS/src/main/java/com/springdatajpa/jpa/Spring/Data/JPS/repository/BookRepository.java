package com.springdatajpa.jpa.Spring.Data.JPS.repository;

import com.springdatajpa.jpa.Spring.Data.JPS.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Entity, ID
public interface BookRepository extends JpaRepository<Book, Long> {
}
