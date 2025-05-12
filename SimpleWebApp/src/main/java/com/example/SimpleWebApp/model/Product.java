package com.example.SimpleWebApp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
public class Product {
    private int prodId;
    private String productName;
    private int price;

    public Product(){

    }

    public Product(int prodId, String productName, int price) {
        this.prodId = prodId;
        this.productName = productName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProduct() {
        return productName;
    }

    public void setProduct(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
