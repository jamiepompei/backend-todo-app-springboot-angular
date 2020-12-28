package com.in28minutes.webservices.restfulwebservices.controllers;

import com.in28minutes.webservices.restfulwebservices.entities.AuthenticationBean;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {


    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean(){
        return new AuthenticationBean("You are authenticated");
    }


}
