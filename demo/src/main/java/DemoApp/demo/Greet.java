package DemoApp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Greet {

    @Autowired
    private Laptop laptop;
    public void hello() {
        laptop.coding();
        System.out.println("Hello Siddharth");
    }
}
