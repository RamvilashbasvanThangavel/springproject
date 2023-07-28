package com.example9.SoftProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoftProjectController {

	@GetMapping(value = "/student")
	public String getStudent() {
		return "This is Student Ramvilash";
	}

	@GetMapping(value = "/trainer")
	public String getTrainer() {
		return "This is Trainer Arun";
	}

	@GetMapping(value = "/manager")
	public String getManager() {
		return "This is Manager MuthuRaman";
	}

}
