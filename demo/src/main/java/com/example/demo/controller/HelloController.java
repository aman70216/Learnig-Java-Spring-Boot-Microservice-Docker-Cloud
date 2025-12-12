package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayhell(){
        return "hello from spring boot";
    }

    @GetMapping("/info")
    public List<String>Getinfo(){

        return List.of("Laptop", "Mobile", "Headphones", "Mouse", "Keyboard");
    }
    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable int id) {

        List<String> Product = List.of("Laptop", "Mobile", "Headphones", "Mouse", "Keyboard");
        return Product.get(id);
    }


}
