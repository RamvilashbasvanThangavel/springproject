package com.example.WorkOut.B02Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.WorkOut.B01Entity.Employee;
import com.example.WorkOut.B03Service.EmployeeService;
import com.example.WorkOut.Exception.AgeEligibleException;
import com.example.WorkOut.Exception.NameNotFoundExceptionCustom;

@RestController
@RequestMapping(value = "/Employee1")
public class EmployeeController {
	@Autowired
	EmployeeService empSer;

	@PostMapping(value = "/List")
	public List<Employee> addEmpList(@RequestBody List<Employee> e) {
		return empSer.addEmpList(e);
	}

	RestTemplate re = new RestTemplate();

	@GetMapping(value = "/GetInBetweenRange/{salary1}/{salary2}")
	public List<Employee> getBySalary(@PathVariable int salary1, @PathVariable int salary2) {
		return empSer.getBySalary(salary1, salary2);
	}

	@GetMapping(value = "/GetAgeLessEmpList/{age}")
	public List<Employee> getLessAgeEmp(@PathVariable int age) {
		return empSer.getLessAgeEmp(age);
	}

	@GetMapping(value = "/GetEmpDetails")
	public List<Employee> getEmpDetails() {
		return empSer.getEmpDetails();
	}

	@PostMapping(value = "/PostEmpDetails")
	public String postEmpDetails(@RequestBody List<Employee> e) {
		return empSer.postEmpDetails(e);
	}

	@DeleteMapping(value = "/DeleteEmpDetails")
	public String deleteEmpDetails(@RequestBody List<Employee> e) {
		return empSer.deleteEmpDetails(e);
	}

	@GetMapping(value = "/GetMaxSalaryEmp")
	public int maxEmployee(@RequestBody List<Employee> e) {
		return empSer.maxSalary(e);
	}

	@PostMapping(value = "/GetMessgeAgeLess")
	public String ageEligible(@RequestBody Employee e) throws AgeEligibleException, Exception {
		return empSer.ageEligible(e);
	}

	@GetMapping(value = "/getNameList/{barnd}")
	public List<Employee> getByName(@PathVariable String barnd) throws NameNotFoundExceptionCustom, Exception {
		return empSer.getByName(barnd);
	}

	@PutMapping(value = "/updateDataById/{id}")
	public String updatebyid(@RequestBody Employee e, @PathVariable int id) {
		return empSer.updatebyid(e, id);
	}

}
