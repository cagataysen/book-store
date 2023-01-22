package com.springegitim.bookstore.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("rest api is working hello world");
    }

}