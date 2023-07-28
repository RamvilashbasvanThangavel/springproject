package com.example6.Flipkart.ba04.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example6.Flipkart.ba05.RepoSitory.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository prdRepo;

}
