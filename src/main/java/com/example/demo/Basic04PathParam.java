package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Basic04PathParam {
	@GetMapping(value = "/check")
	public String nameCheck(String usr, String pass) {
		if (usr.equals("Ram") && pass.equals("1804")) {
			return "Hai";
		} else {
			return "usr and pass not valid";
		}
	}

}
