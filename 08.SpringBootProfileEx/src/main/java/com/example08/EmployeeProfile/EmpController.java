package com.example08.EmployeeProfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@Value("${checking.thisvalue}")
	private String name;

	@GetMapping(value = "/getThis")
	public String getThisData() {
		return "Hello World = " + name;
	}

}
