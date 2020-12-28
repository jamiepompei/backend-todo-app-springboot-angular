package com.in28minutes.webservices.restfulwebservices.jwt.resource;

public class AuthenticationException extends RuntimeException{
    public AuthenticationException(String message, Throwable cause){
        super(message, cause);
    }
}
