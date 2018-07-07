package com.kfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zjutK on 2018/7/6.
 */
//@RestController
@SpringBootApplication
public class App {
//    @RequestMapping("/")
//    public String hello() {
//        return "Hello World";
//    }
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
