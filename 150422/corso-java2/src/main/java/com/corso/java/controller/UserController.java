package com.corso.java.controller;

import com.corso.java.domain.User;
import com.corso.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(path="/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return new ResponseEntity(userRepository.getUserById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable String id) {
        userRepository.deleteById(id);
    }

    @PutMapping()
    public void insert(@RequestParam String id, @RequestParam String name, @RequestParam String lastName, @RequestParam String email, @RequestParam int age) {
        User user1 = new User(id, name, lastName, email, age);
        userRepository.insert(user1);
    }
}
