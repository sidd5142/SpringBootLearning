package com.JavaSpring.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
//    private Laptop laptop;
    @Qualifier("laptop")
    private Computer computer;
    public void  build()
    {
        computer.compile();
        System.out.println("Coding is imp");
    }
}
