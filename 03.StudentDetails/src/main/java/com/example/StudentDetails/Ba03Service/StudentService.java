package com.example.StudentDetails.Ba03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.StudentDetails.Ba01Entity.Student;
import com.example.StudentDetails.Ba04Dao.StudentDao;
import com.example.StudentDetails.Ba06Exception.AgeEligibleException;

@Service
public class StudentService {
	@Autowired
	StudentDao stuDao;

	public String addList(List<Student> s) {
		return stuDao.addList(s);
	}

	public List<Student> getList() {
		return stuDao.getList();
	}

	public String deleteAllList() {
		return stuDao.deleteAllList();
	}

	public String updateById(Student s) {
		return stuDao.updateById(s);
	}

	public String ageLessThan18(Student s) throws AgeEligibleException, Exception {
		if (s.getAge() < 18) {
			throw new AgeEligibleException("Not eligible to join the Course");
		} else {
			return stuDao.ageLessThan18(s);
		}
	}

	public String ageLess(Student s) throws AgeEligibleException, Exception {
		try {
		if (s.getAge() < 18) {
			throw new AgeEligibleException("Not eligible to join the Course");
		} else {
			return stuDao.ageLessThan18(s);
		}}
		catch(Exception e) {
			return "Under age Not Eligible";
		}
	}

	public int attendanceDetails(int rollnumber) {
		return stuDao.attendanceDetails(rollnumber);
	}

	public Student getDetails(int rollnumber) {
		return stuDao.getDetails(rollnumber);
	}
}
