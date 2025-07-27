package com.example.demo.runner;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements CommandLineRunner {

    private final BookRepository bookRepo;

    public BookRunner(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) {
        bookRepo.save(new Book("Spring in Action", "Craig Walls"));
        bookRepo.save(new Book("Hibernate Tips", "Thorben Janssen"));

        System.out.println("Books by Craig Walls:");
        bookRepo.findByAuthor("Craig Walls")
                .forEach(b -> System.out.println(b.getTitle()));

        bookRepo.deleteById(1L);

        System.out.println("All Books:");
        bookRepo.findAll().forEach(b -> System.out.println(b.getTitle()));
    }
}
