package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book, Integer> {
    // No custom methods needed for basic CRUD operations.
    // MongoRepository already provides methods like save(), findAll(), findById(), and deleteById().
}
