package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.desktop.SystemEventListener;


// Command line runner
@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository ;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();

        publisher.setCity("Los Angeles");
        publisher.setState("CA");
        publisher.setName("Joe");
        publisher.setAddressLine("4664 Purdue Ave");
        this.publisherRepository.save(publisher);

        System.out.println("Publisher Count "+publisherRepository.count());
        System.out.println("Publisher data "+publisher);
        Author author = new Author("Eric", "Enrichas");
        Book book = new Book("Domain Driven", "1122333");
        book.getAuthors().add(author);
        author.getBooks().add(book);
        this.authorRepository.save(author); //
        this.bookRepository.save(book);

        Author rod = new Author("Rod", "Johnson");
        Book j2ee = new Book("J2EE", "43423323");
        rod.getBooks().add(j2ee);
        j2ee.getAuthors().add(rod); //
        this.authorRepository.save(rod); //
        this.bookRepository.save(j2ee);
        System.out.println("Started in Bootstrap");
        System.out.println("Length of books "+this.bookRepository.count());

    }


}
