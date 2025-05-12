package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Realme",17000),
            new Product(102,"Oppo",20000),
            new Product(103,"Samsung",50000));

    public List<Product> getProducts() {
        return products;
    }
}
