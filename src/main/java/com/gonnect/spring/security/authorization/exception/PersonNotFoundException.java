package com.gonnect.spring.security.authorization.exception;

public class PersonNotFoundException extends RuntimeException {
    
	//Custom exception
   public PersonNotFoundException(String message) {
        super(message);
    }
}
