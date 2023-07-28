package com.example6.Flipkart.ba03.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example6.Flipkart.ba04.Dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	ProductDao prdDao;

}
