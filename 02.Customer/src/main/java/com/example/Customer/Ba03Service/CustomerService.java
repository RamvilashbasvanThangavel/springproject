package com.example.Customer.Ba03Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.Ba01Entity.Customer;
import com.example.Customer.Ba04Dao.CustomerDao;

@Service
public class CustomerService {
	@Autowired
	CustomerDao custDao;

	public String addList(Customer c) {
		return custDao.addList(c);
	}

}
