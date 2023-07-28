package com.example9.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

	@Autowired
	RestTemplate rest;

	@GetMapping(value = "/getMobile")
	public String getMobileData() {
		// String url1 = "http://localhost:8090/getMobileDetails";
		String url1 = "http://ProductDetailsApi/getMobileDetails";
		ResponseEntity<String> r = rest.exchange(url1, HttpMethod.GET, null, String.class);
		String data = r.getBody();
		return data;
	}

}
