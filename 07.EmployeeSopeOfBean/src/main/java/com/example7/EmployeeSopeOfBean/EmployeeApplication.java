package com.example7.EmployeeSopeOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example7.EmployeeSopeOfBean.ba01.Entity.Employee;

@SpringBootApplication
public abstract class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired
	ApplicationContext con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		Employee e1 = con.getBean(Employee.class);
		System.out.println(e1);
		Employee e2 = con.getBean(Employee.class);
		e2.setName("Sinthya");
		System.out.println(e2);
		Employee e3 = con.getBean(Employee.class);
		System.out.println(e3);
	}
	
}
