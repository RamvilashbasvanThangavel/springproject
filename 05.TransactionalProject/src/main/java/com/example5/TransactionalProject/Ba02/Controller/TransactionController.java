package com.example5.TransactionalProject.Ba02.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example5.TransactionalProject.Ba01.Entity.Transaction;
import com.example5.TransactionalProject.Ba02.Repository.RecevierRepository;
import com.example5.TransactionalProject.Ba02.Repository.SenderRepository;

import jakarta.transaction.Transactional;

@RestController
public class TransactionController {
	@Autowired
	SenderRepository sr;
	@Autowired
	RecevierRepository rr;

	@PostMapping(value = "/postThis")
	@Transactional
	public String postobj(@RequestBody Transaction t) {
		sr.save(t.getSender());
		int a = 10 / 0;
		System.out.println(a);
		rr.save(t.getRecevier());
		return "Saved SuccessFully";
	}

}
