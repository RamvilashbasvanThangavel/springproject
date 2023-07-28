package com.example.WorkOut.B05Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.WorkOut.B01Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "Select * from employee1 where salary>=? AND salary<=?", nativeQuery = true)
	public List<Employee> getBySalary(int salary1, int salary2);

	@Query(value = "Select * from employee1 where age<=?", nativeQuery = true)
	public List<Employee> getLessAgeEmp(int age);

	@Query(value = "Select * From employee1", nativeQuery = true)
	public List<Employee> getEmpDetails();

	@Query(value = "Select * From employee1", nativeQuery = true)
	public String postEmpDetails(List<Employee> e);

	@Query(value = "Select * from employee1", nativeQuery = true)
	public String deleteEmpDetails(List<Employee> e);

	@Query(value = "select max(salary) From employee1", nativeQuery = true)
	public int maxSalary(List<Employee> e);

	@Query(value = "Select * From employee1 where name=?", nativeQuery = true)
	public List<Employee> getByName(String name);

	
}
