package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Basic03PathVariable {
	
	@GetMapping(value = "/Add/{a}/{b}")
	public int add(@PathVariable int  a,@PathVariable int b) {
		return a+b;
	}
	@GetMapping(value = "/VE/{a}")
	public String age(@PathVariable int a) {
		if(a>18) {
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}
	}
	@GetMapping(value="/Factorial/{a}")
	public int value(@PathVariable int a) {
		int b = 1;
		for(int i = 1;i<=a;i++) {
			b = b*i;
	}
		return b;
    }
	@GetMapping(value="/Prime/{p}")
	public String prime(@PathVariable int p) {
	     String a= "Prime";
		for(int i = 2;i<p;i++) {
			if(p%i==0) {
				a ="Not Prime";
			}
		}
		return (p+"-"+a);
	
	}
}

