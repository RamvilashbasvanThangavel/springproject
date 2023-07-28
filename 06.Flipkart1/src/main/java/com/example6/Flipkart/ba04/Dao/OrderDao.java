package com.example6.Flipkart.ba04.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example6.Flipkart.ba01.Entity.OrderEntity;
import com.example6.Flipkart.ba05.RepoSitory.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository ordRepo;

	public String postData(OrderEntity oe) {
		ordRepo.save(oe);
		return "Saved";

	}

	public List<String> getCityandProduct() {
		return ordRepo.getCityandProduct();
	}

}
