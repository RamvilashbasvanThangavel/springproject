package com.example.WorkOut.B03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WorkOut.B01Entity.Employee;
import com.example.WorkOut.B04Dao.EmployeeDao;
import com.example.WorkOut.Exception.AgeEligibleException;
import com.example.WorkOut.Exception.NameNotFoundExceptionCustom;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;

	public List<Employee> addEmpList(List<Employee> e) {
		return empDao.addEmpList(e);
	}

	public List<Employee> getBySalary(int salary1, int salary2) {
		return empDao.getBySalary(salary1, salary2);
	}

	public List<Employee> getLessAgeEmp(int age) {
		return empDao.getLessAgeEmp(age);
	}

	public List<Employee> getEmpDetails() {
		return empDao.getEmpDetails();
	}

	public String postEmpDetails(List<Employee> e) {
		return empDao.postEmpDetails(e);
	}

	public String deleteEmpDetails(List<Employee> e) {
		return empDao.deleteEmpDetails(e);
	}

	public int maxSalary(List<Employee> e) {
		return empDao.maxSalary(e);
	}

	public String ageEligible(Employee e) throws AgeEligibleException, Exception {
		if (e.getAge() < 18) {
			throw new AgeEligibleException("Age Not Eligible For Joining");
		} else {
			return empDao.ageEligible(e);
		}
	}

	public List<Employee> getByName(String barnd) throws NameNotFoundExceptionCustom, Exception {
		if (empDao.getByName(barnd).isEmpty()) {
			throw new NameNotFoundExceptionCustom("barnd not Found Error");
		} else {
			return empDao.getByName(barnd);
		}
	}

	public String updatebyid(Employee e,int id) {
		return empDao.updatebyid(e,id);
	}

}
