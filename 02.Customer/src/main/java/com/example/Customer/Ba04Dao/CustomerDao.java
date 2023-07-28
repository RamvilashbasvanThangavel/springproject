package com.example.Customer.Ba04Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Customer.Ba01Entity.Customer;
import com.example.Customer.Ba05Repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository custRepo;

	public String addList(Customer c) {
		custRepo.save(c);
		return "List Save SuccessFully";
	}
}
