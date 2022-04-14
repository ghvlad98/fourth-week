package com.corso.java.controller;

import com.corso.java.domain.Book;
import com.corso.java.repository.BookRepository;
import com.corso.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @GetMapping(path="/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        return new ResponseEntity(bookRepository.getBookById(id), HttpStatus.OK);
    }

    @GetMapping(path="/pages")
    public ResponseEntity<Book> getBookByPages(@RequestParam Integer pages) {
        return new ResponseEntity(bookRepository.getBookByPages(pages), HttpStatus.OK);
    }

    @GetMapping(path="/authorName")
    public ResponseEntity<Book> getBooksByAuthorOrName(@RequestParam String author, @RequestParam String name) {
        return new ResponseEntity(bookRepository.getBooksByAuthorOrName(author, name), HttpStatus.OK);
    }

    @GetMapping(path="/booksCount")
    public ResponseEntity<Book> getBooksCountByAuthor(@RequestParam String author) {
        return new ResponseEntity(bookRepository.getBooksCountByAuthor(author), HttpStatus.OK);
    }

    @GetMapping(path="/booksSort")
    public ResponseEntity<Book> getBooksByAuthorSortByName(@RequestParam String author) {
        return new ResponseEntity(bookRepository.getBooksByAuthorSortByName(author), HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<?> update(@PathVariable(name="id") Integer id, @RequestParam String name, @RequestParam String value) {
        bookService.updateSpecificField(name, value);
        return new ResponseEntity("Record aggiornato con successo", HttpStatus.OK);
    }
}
