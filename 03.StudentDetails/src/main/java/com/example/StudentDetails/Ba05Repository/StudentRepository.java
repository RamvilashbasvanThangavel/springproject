package com.example.StudentDetails.Ba05Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentDetails.Ba01Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select attendance from student where rollnumber=?", nativeQuery = true)
	public int attendanceDetails(int rollnumber);

}
