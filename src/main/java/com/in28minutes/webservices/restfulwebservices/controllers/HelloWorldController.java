package com.in28minutes.webservices.restfulwebservices.controllers;

import com.in28minutes.webservices.restfulwebservices.entities.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World-changed");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello Woeld - changed, %s", name));
    }
}
