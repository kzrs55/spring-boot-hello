package com.kfit.test.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjutK on 2018/7/7.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String Hello(){
        return "Hello World";
    }
}
