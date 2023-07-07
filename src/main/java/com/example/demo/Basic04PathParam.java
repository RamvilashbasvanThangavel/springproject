package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import jakarta.websocket.server.PathParam;

public class Basic04PathParam {
	@GetMapping(value="/check")
	public String nameCheck(@PathParam("usr") String usr,@PathParam("pass") String pass) {
		if(usr.equals("Ram")&& pass.equals("1804")) {
			return "Hai";
		}
		else {
			return "usr and pass not valid";
		}
	}
	

}
