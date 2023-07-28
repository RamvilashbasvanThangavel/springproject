package com.example.StudentDetails.Ba04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.StudentDetails.Ba01Entity.Student;
import com.example.StudentDetails.Ba05Repository.StudentRepository;
import com.example.StudentDetails.Ba06Exception.AgeEligibleException;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stuRepo;

	public String addList(List<Student> s) {
		stuRepo.saveAll(s);
		return "List Saved Successfully";
	}

	public List<Student> getList() {
		return stuRepo.findAll();
	}

	public String deleteAllList() {
		stuRepo.deleteAll();
		return "Deleted SuccessFully";
	}

	public String updateById(Student s) {
		stuRepo.save(s);
		return "Updated SuccessFully";
	}

	public String ageLessThan18(Student s) throws AgeEligibleException, Exception {
		stuRepo.save(s);
		return "Posted Successfully";
	}

	public String ageLess(Student s) throws AgeEligibleException, Exception {
		stuRepo.save(s);
		return "Posted Successfully";
	}

	public int attendanceDetails(int rollnumber) {
		return stuRepo.attendanceDetails(rollnumber);
	}
	
	public Student getDetails(int rollnumber) {
		return stuRepo.findById(rollnumber).get();
	}

}
