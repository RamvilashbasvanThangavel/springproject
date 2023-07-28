package com.example.StudentMarkSheet.ba05Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentMarkSheet.ba01Entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {

	@Query(value = "Select Sem1Total+Sem2Total from marksheet where rollnumber=?", nativeQuery = true)
	public int getTotalByRollNo(int rollnumber);

}
