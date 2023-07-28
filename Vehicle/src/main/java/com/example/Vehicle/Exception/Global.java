package com.example.Vehicle.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Global {
	@ExceptionHandler(value = CarException.class)
	public ResponseEntity<Object> nameNull(CarException ce) {
		return new ResponseEntity<>(ce.getMessage(), HttpStatus.NOT_FOUND);
	}
}
