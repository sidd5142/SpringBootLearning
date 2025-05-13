package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // demo of database
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Realme",17000),
//            new Product(102,"Oppo",20000),
//            new Product(103,"Samsung",50000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100,"No Item",0));
        return repo.findById(prodId).orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product prod) {
//        System.out.println(prod);
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int indx = 0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId()) {
//                indx = i;
//            }
//        }
//        products.set(indx,prod);

        repo.save(prod);   // this will save the object if not found or else modify it automatically
    }

    public void dltProduct(int prodId) {
//        int indx = 0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId() == prodId) {
//                indx = i;
//            }
//        }
//        products.remove(indx);

        repo.deleteById(prodId);
    }
}
