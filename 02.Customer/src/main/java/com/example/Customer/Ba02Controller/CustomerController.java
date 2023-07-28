package com.example.Customer.Ba02Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Customer.Ba01Entity.Customer;
import com.example.Customer.Ba03Service.CustomerService;

@RestController
@RequestMapping(value = "/Customer")
public class CustomerController {
	@Autowired
	CustomerService custSer;

	@Autowired
	RestTemplate rT;

	@PostMapping(value = "/postedWithIfsc")
	public String getWithIfsc(@RequestBody Customer c) {
		String url1 = "http://localhost:8080/Bank/getIfscbyBranch/";
		ResponseEntity<String> response1 = rT.exchange(url1 + (c.getBranch()), HttpMethod.GET, null, String.class);
		String temp = response1.getBody();
		c.setIfsc(temp);
		return custSer.addList(c);
	}

}
