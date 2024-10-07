package com.Mediator.Mediator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    @GetMapping ("/")
    public String hello(){
        return "hello world";
    }
}
