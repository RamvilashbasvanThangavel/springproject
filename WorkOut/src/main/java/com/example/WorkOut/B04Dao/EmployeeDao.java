package com.example.WorkOut.B04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.WorkOut.B01Entity.Employee;
import com.example.WorkOut.B05Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;

	public List<Employee> addEmpList(List<Employee> e) {
		return empRepo.saveAll(e);
	}

	public List<Employee> getBySalary(int salary1, int salary2) {
		return empRepo.getBySalary(salary1, salary2);
	}

	public List<Employee> getLessAgeEmp(int age) {
		return empRepo.getLessAgeEmp(age);
	}

	public List<Employee> getEmpDetails() {
		return empRepo.getEmpDetails();
	}

	public String postEmpDetails(List<Employee> e) {
		empRepo.saveAll(e);
		return "Posted SuccessFully";
	}

	public String deleteEmpDetails(List<Employee> e) {
		empRepo.deleteAll();
		return "Deleted";
	}

	public int maxSalary(List<Employee> e) {
		return empRepo.maxSalary(e);
	}

	public String ageEligible(Employee e) {
		empRepo.save(e);
		return "Success";
	}

	public List<Employee> getByName(String barnd) {
		return empRepo.getByName(barnd);
	}

	public String updatebyid(Employee e, int id) {
		empRepo.save(e);
		return "data Saved";

	}
}
