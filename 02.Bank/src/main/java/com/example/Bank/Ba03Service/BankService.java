package com.example.Bank.Ba03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bank.Ba01Entity.Bank;
import com.example.Bank.Ba04Dao.BankDao;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;

	public String addList(List<Bank> b) {
		return bankDao.addList(b);
	}

	public String getIfsc(String branch) {
		return bankDao.getIfsc(branch);
	}
}
