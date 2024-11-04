package com.example.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/listUsers")
  public ResponseEntity<String> getUsers() {
    return ResponseEntity.ok("List of users");
  }

  @PostMapping
  public ResponseEntity<String> createUser(@RequestBody String user) {
    return ResponseEntity.ok("User created: " + user);
  }
}

