package com.example.StudentResults.Ba04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.StudentResults.Ba01Entity.Results;
import com.example.StudentResults.Ba05Repository.ResultsRepository;

@Repository
public class ResultsDao {
	@Autowired
	ResultsRepository resRepo;

	public String addList(List<Results> r) {
		resRepo.saveAll(r);
		return "List Saved Successfully";
	}

	public List<Results> getList(List<Results> rN) {
		return resRepo.saveAll(rN);
	}

	public List<Results> additionalMarks(List<Results> rN) {
		return resRepo.saveAll(rN);
	}

}
