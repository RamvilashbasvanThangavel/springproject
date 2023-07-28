package com.example.StudentDetails.Ba02Controller;

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

import com.example.StudentDetails.Ba01Entity.Student;
import com.example.StudentDetails.Ba03Service.StudentService;
import com.example.StudentDetails.Ba06Exception.AgeEligibleException;

@RestController
@RequestMapping(value = "/Student")
public class StudentController {
	@Autowired
	StudentService stuSer;

	@PostMapping(value = "/PostingAllList")
	public String addList(@RequestBody List<Student> s) {
		return stuSer.addList(s);
	}// http://localhost:8080/Student/PostingAllList

	@GetMapping(value = "/gettingAllList")
	public List<Student> getList() {
		return stuSer.getList();
	}// http://localhost:8080/Student/gettingAllList

	@DeleteMapping(value = "/deletingAllList")
	public String deleteAllList() {
		return stuSer.deleteAllList();
	}// http://localhost:8080/Student/deletingAllList

	@PutMapping(value = "/updatingById")
	public String updateById(@RequestBody Student s) {
		return stuSer.updateById(s);
	}// http://localhost:8080/Student/updatingById

	@PostMapping(value = "/getMessageAgeLess")
	public String ageLessThan18(@RequestBody Student s) throws AgeEligibleException, Exception {
		return stuSer.ageLessThan18(s);
	}// http://localhost:8080/Student/getMessageAgeLess

	@PostMapping(value = "/ageLessExceptionHandled")
	public String ageLess(@RequestBody Student s) throws AgeEligibleException, Exception {
		return stuSer.ageLessThan18(s);
	}// http://localhost:8080/Student/ageLessExceptionHandled

	@GetMapping(value = "/attendancePercentage/{rollnumber}")
	public int attendanceDetails(@PathVariable int rollnumber) {
		return stuSer.attendanceDetails(rollnumber);
	}

	@GetMapping(value = "/gettingDetails/{rollnumber}")
	public Student getDetails(@PathVariable int rollnumber) {
		return stuSer.getDetails(rollnumber);
	}

}
