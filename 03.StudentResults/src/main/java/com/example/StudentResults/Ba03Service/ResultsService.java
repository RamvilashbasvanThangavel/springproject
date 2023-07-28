package com.example.StudentResults.Ba03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.StudentResults.Ba01Entity.Results;
import com.example.StudentResults.Ba04Dao.ResultsDao;

@Service
public class ResultsService {
	@Autowired
	ResultsDao resDao;

	public String addList(List<Results> r) {
		return resDao.addList(r);
	}

	public List<Results> getList(List<Results> r) {
		return resDao.getList(r);
	}

	public List<Results> additionalMarks(List<Results> r) {
		return resDao.getList(r);
	}

}
