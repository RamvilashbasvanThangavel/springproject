package com.example.WorkOut.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalClassHandling {
	@ExceptionHandler(value = NameNotFoundExceptionCustom.class)
	public ResponseEntity<Object> nameNotHandling(NameNotFoundExceptionCustom nfe) { // Handling Exception
		return new ResponseEntity<>(nfe.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = AgeEligibleException.class)
	public ResponseEntity<Object> ageEligiblityHandling(AgeEligibleException aee) { // Handling Exception
		return new ResponseEntity<>(aee.getMessage(), HttpStatus.NOT_FOUND);
	}
}