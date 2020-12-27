package com.in28minutes.webservices.restfulwebservices.services;

import com.in28minutes.webservices.restfulwebservices.entities.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardCodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static Long idCounter = 0L;

    static{
        todos.add(new Todo(++idCounter, "pompy", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idCounter, "pompy", "Learn about microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "pompy", "Learn Angular", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo deleteById(Long id){
        Todo todo = findById(id);
        if(todo==null) return null;

        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    public Todo findById(Long id) {
        for(Todo todo : todos){
            if(todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }
}
