package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Basic01Demo {
	@GetMapping(value = "/Hai")
	public String setHi() {
		return "Hello World";
	}

	@GetMapping(value = "/Name")
	public String setName(String a) {
		return "RamvilashBasvan Thangavel";
	}

	@GetMapping(value = "/Add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/VE/{a}")
	public String age(@PathVariable int a) {
		if (a > 18) {
			return "Eligible";
		} else {
			return "Not Eligible";
		}
	}

	@GetMapping(value = "/check")
	public String nameCheck(@PathParam("usr") String usr, @PathParam("pass") String pass) {
		if (usr.equals("Ram") && pass.equals("1804")) {
			return "Hai";
		} else {
			return "usr and pass not valid";
		}
	}

	@GetMapping(value = "/Number50/{a}")
	public List<Integer> num(@PathVariable int a) {
		List<Integer> data = new ArrayList<>();
		for (int i = 0; i <= a; i++) {
			data.add(i);
		}
		return data;
	}

	@GetMapping(value = "/Even/{a}")
	public List<Integer> even(@PathVariable int a) {
		List<Integer> ev = new ArrayList<>();
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				ev.add(i);
			}
		}
		return ev;
	}

	@GetMapping(value = "/Factorial/{a}")
	public int value(@PathVariable int a) {
		int b = 1;
		for (int i = 1; i <= a; i++) {
			b = b * i;
		}
		return b;
	}

	@GetMapping(value = "/Fib/{v}")
	public List<Integer> fib(@PathVariable int v) {
		List<Integer> fb = new ArrayList<>();
		int a = 0;
		int b = 1;
		int c = a + b;
		for (int i = 0; i < v; i++) {
			a = b;
			b = c;
			c = a + b;
			fb.add(a);

		}
		return fb;
	}

	@GetMapping(value = "/Prime/{p}")
	public String prime(@PathVariable int p) {
		String a = "Prime";
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				a = "Not Prime";
			}
		}
		return (p + "-" + a);

	}

	@GetMapping(value = "/Emp")
	public Employee getEmp(@RequestBody Employee e) {
		e.setSalary(e.getSalary() + 20000);
		return e;
	}

	@GetMapping(value = "/Emps")
	public Employee getEmps(@RequestBody Employee e) {
		return e;
	}

	@GetMapping(value = "/Lstemp")
	public List<Employee> emps(@RequestBody List<Employee> a) {
		return a;
	}

	@GetMapping(value = "/FemaleEmp")
	public List<Employee> femps(@RequestBody List<Employee> a) {
		return a.stream().filter((x) -> x.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());

	}

	@GetMapping(value = "/maleEmp")
	public List<Employee> memps(@RequestBody List<Employee> a) {
		return a.stream().filter((x) -> x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());

	}

	@GetMapping(value = "/MaxSal")
	public Employee max1(@RequestBody List<Employee> a) {
		return a.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}

	@GetMapping(value = "/MinSal")
	public Employee min1(@RequestBody List<Employee> a) {
		return a.stream().min(Comparator.comparing(Employee::getSalary)).get();
	}

	@GetMapping(value = "/Age")
	public List<Employee> age(@RequestBody List<Employee> a) {
		List<Employee> age45 = a.stream().filter((x) -> x.getAge() >= 45).collect(Collectors.toList());
		age45.forEach((x) -> x.setSalary(x.getSalary() + x.getSalary() * 5 / 100));
		return age45;
	}

	@GetMapping(value = "/AgeSort")
	public List<Employee> ageSort(@RequestBody List<Employee> a) {
		List<Employee> atoZ = a.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		return atoZ;
	}

	@GetMapping(value = "/AgeRevSort")
	public List<Employee> ageReverseSort(@RequestBody List<Employee> a) {
		List<Employee> ztoa = a.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		return ztoa;
	}

}
