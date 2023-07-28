package com.example.Bank.Ba04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Bank.Ba01Entity.Bank;
import com.example.Bank.Ba05Repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;

	public String addList(List<Bank> b) {
		bankRepo.saveAll(b);
		return "List Saved Successfully";
	}

	public String getIfsc(String branch) {
		return bankRepo.getIfsc(branch);
	}

}
