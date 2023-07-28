package com.example4.BasicPrepData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewClass {

	@Autowired
	RestTemplate rest;

	@GetMapping(value = "/getThis")
	public String getData() {
		String url = "http://localhost:8080/Name";
		ResponseEntity<String> var = rest.exchange(url, HttpMethod.GET, null, String.class);
		String data = var.getBody();
		return data;
	}

}
