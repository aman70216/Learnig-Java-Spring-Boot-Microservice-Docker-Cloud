package com.example.demo.controller;

import com.example.demo.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

@GetMapping
    public List<Product> getAllProduct(){
    return List.of(
            new Product(1,"miakhalifa",15463.55),
            new Product(7,"lala",154563.55),
            new Product(6,"sunnyleon",154653.55),
            new Product(2,"prachilifa",1549563.55)
    );
}
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return new Product(id, "Sample Product", 999);
    }
}

