package com.example.productservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/products")
public class ProductController {

  @GetMapping("/listProducts")
  public ResponseEntity<String> getProducts() {
    return ResponseEntity.ok("List of products");
  }

  @PostMapping
  public ResponseEntity<String> createProduct(@RequestBody String product) {
    return ResponseEntity.ok("Product created: " + product);
  }
}

