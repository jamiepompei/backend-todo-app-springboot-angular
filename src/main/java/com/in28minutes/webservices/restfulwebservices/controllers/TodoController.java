package com.in28minutes.webservices.restfulwebservices.controllers;
import com.in28minutes.webservices.restfulwebservices.entities.Todo;
import com.in28minutes.webservices.restfulwebservices.services.TodoHardCodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoController {

    @Autowired
    private TodoHardCodedService todoService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return todoService.findAll();
    }

    @GetMapping("/users/{username}/todos/{id}")
    public Todo getTodo(@PathVariable String username, @PathVariable Long id){
        return todoService.findById(id);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id){

       Todo todo = todoService.deleteById(id);
       if(todo!=null){
           return ResponseEntity.noContent().build();
       }
       return ResponseEntity.notFound().build();
    }


}
