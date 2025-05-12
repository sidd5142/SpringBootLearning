package com.example.SimpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // used to give the data from server side to client side
public class HomeController {

    @RequestMapping("/") // used to request the endpoint and here we use for homepage
    public String greet() {
        return "Welcome Sidd !!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "I'm learnign Spring Boot";
    }
}
