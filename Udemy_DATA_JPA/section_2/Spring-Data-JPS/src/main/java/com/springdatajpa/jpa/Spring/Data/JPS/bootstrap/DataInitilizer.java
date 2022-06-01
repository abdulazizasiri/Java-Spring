package com.springdatajpa.jpa.Spring.Data.JPS.bootstrap;

import com.springdatajpa.jpa.Spring.Data.JPS.entity.Book;
import com.springdatajpa.jpa.Spring.Data.JPS.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// 12500 * 30


@Component
public class DataInitilizer  implements CommandLineRunner {

    private final BookRepository bookRepository ;

    public DataInitilizer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner component");
        Book newBook = new Book("Domain Driven Design", "123", "RandomHouse");
        System.out.println("ID : "+newBook.getId());

        Book saveDDD = bookRepository.save(newBook);
        Book springBook = new Book("Spring in Action", "456", "RandomGuy");
        System.out.println("ID : "+springBook.getId());

        Book savedSpringBook = bookRepository.save(springBook);

        this.bookRepository.findAll().forEach(item -> {
            System.out.println("Book title"+item.getTitle());
            System.out.println("Book Publisher "+item.getPublisher());
        });



    }
}
