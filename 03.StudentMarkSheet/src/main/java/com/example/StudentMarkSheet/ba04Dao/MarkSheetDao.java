package com.example.StudentMarkSheet.ba04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentMarkSheet.ba01Entity.MarkSheet;
import com.example.StudentMarkSheet.ba05Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository markRepo;

	public List<MarkSheet> addList(List<MarkSheet> mark) {
		return markRepo.saveAll(mark);

	}

	public List<MarkSheet> getdetails() {
		return markRepo.findAll();
	}

	public int getTotalByRollNo(int rollnumber) {
		return markRepo.getTotalByRollNo(rollnumber);
	}

}
