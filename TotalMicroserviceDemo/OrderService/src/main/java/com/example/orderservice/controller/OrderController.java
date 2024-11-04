package com.example.orderservice.controller;

import java.time.Duration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
//@RequestMapping("/orders")
public class OrderController {

  @GetMapping("/listOrders")
  public ResponseEntity<String> getOrders() {
    return ResponseEntity.ok("List of orders");
  }

  @PostMapping
  public ResponseEntity<String> createOrder(@RequestBody String order) {
    return ResponseEntity.ok("Order created: " + order);
  }

  @GetMapping("/flux")
  public Flux<String> getFlux() {
    return Flux.just("Nguyen ", "Khanh ", "Hoa").delayElements(Duration.ofSeconds(1));
  }
}

