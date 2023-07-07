package com.example.demo;

public class Employee {
	int id;
	String name;
	String department;
	String gender;
	int salary;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String name, String department, String gender, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", gender=" + gender
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	public Basic01Demo Streams() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
