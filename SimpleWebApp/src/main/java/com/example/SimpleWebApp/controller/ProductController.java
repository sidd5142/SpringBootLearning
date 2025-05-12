package com.example.SimpleWebApp.controller;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

//    @RequestMapping("/products") in this by default it takes get
    @GetMapping("/products")  // for particaluar we define with methond and default is get
    public List<Product> getProdcts() {
        return service.getProducts();
    }


    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public  void addProducts(Product prod) {
        service.addProduct(prod);
    }
}
