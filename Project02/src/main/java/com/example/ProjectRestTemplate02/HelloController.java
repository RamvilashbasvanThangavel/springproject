package com.example.ProjectRestTemplate02;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	RestTemplate rest = new RestTemplate();

	@GetMapping(value = "/getHiViaHello")
	public String getHello() {
		String url = "http://localhost:8080/getHi";
		ResponseEntity<String> r = rest.exchange(url, HttpMethod.GET, null, String.class);
		String val = r.getBody();
		return val;
	}

}
