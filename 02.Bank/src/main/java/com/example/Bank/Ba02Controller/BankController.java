package com.example.Bank.Ba02Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bank.Ba01Entity.Bank;
import com.example.Bank.Ba03Service.BankService;

@RestController
@RequestMapping(value = "/Bank")
public class BankController {
	@Autowired
	BankService bankSer;

	@PostMapping(value = "/PostingAllList")
	public String addList(@RequestBody List<Bank> b) {
		return bankSer.addList(b);
	}

	@GetMapping(value = "/getIfscbyBranch/{branch}")
	public String getIfsc(@PathVariable String branch) {
		return bankSer.getIfsc(branch);
	}

}
