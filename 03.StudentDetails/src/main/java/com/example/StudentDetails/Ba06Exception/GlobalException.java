package com.example.StudentDetails.Ba06Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	// @ExceptionHandler(value = AgeEligibleException.class)
	// public ResponseEntity<Object> ageEligiblityHandling(AgeEligibleException aee)
	// {
	// return new ResponseEntity<>(aee.getMessage(), HttpStatus.NOT_FOUND);
	// }

}
