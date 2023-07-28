package com.example.Product.Ba03Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Product.Ba04Repository.ProductRepository;
import com.example.Product.Ba0Entity.Product;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepo;

	public String addList(List<Product> p) {
		productRepo.saveAll(p);
		return "List Saved SuccessFully";
	}

	public List<Product> findList() {
		return productRepo.findAll();
	}

}
