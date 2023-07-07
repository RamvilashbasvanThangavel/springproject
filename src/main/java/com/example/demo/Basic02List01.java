package com.example.demo;

import java.util.ArrayList;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

public class Basic02List01 {
	@GetMapping(value="/Number50/{a}")
	public List<Integer> num(@PathVariable int a) {
		List<Integer> data = new ArrayList<>();
		for(int i = 0;i<=a;i++) {
			data.add(i);
		}
		return data;
	}
	@GetMapping(value="/Even/{a}")
	public List<Integer> even(@PathVariable int a){
		List<Integer> ev = new ArrayList<>();
		for(int i = 0;i<=a;i++) {
			if(i%2==0) {
				ev.add(i);
		}
		}
		return ev;
	}
	@GetMapping(value="/Factorial/{a}")
	public int value(@PathVariable int a) {
		int b = 1;
		for(int i = 1;i<=a;i++) {
			b = b*i;
	}
		return b;
    }
	@GetMapping(value="/Fib/{v}")
	public List<Integer> fib(@PathVariable int v) {
		List<Integer> fb = new ArrayList<>();
		int a = 0;
		int b = 1;
		int c = a+b;
		for (int i = 0; i < v; i++) {
			a = b;
			b = c;
			c = a + b;
		    fb.add(a);
		
	}
		return fb;
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
