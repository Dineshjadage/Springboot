package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private BookRepo repo;

    // Add a new book
    @PostMapping("/addbook")
    public ResponseEntity<String> saveBook(@RequestBody Book book) {
        repo.save(book);
        return new ResponseEntity<>("Book added successfully", HttpStatus.CREATED);
    }

    // Get all books
    @GetMapping("/findAllBooks")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = repo.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // Delete a book by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        Optional<Book> book = repo.findById(id);
        if (book.isPresent()) {
            repo.deleteById(id);
            return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
        }
    }

    // Update an existing book
    @PutMapping("/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        Optional<Book> existingBook = repo.findById(book.getId());
        if (existingBook.isPresent()) {
            repo.save(book);
            return new ResponseEntity<>("Book updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
        }
    }
}
