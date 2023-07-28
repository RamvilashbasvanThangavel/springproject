package com.example.StudentMarkSheet.ba03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMarkSheet.ba01Entity.MarkSheet;
import com.example.StudentMarkSheet.ba04Dao.MarkSheetDao;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao markDao;

	public List<MarkSheet> addList(List<MarkSheet> mark) {
		return markDao.addList(mark);
	}

	public List<MarkSheet> getdetails() {
		return markDao.getdetails();
	}

	public int getTotalByRollNo(int rollnumber) {
		return markDao.getTotalByRollNo(rollnumber);
	}
}
