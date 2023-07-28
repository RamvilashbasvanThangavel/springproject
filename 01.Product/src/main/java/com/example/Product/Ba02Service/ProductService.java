package com.example.Product.Ba02Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product.Ba03Dao.ProductDao;
import com.example.Product.Ba0Entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
   
	public String addList(List<Product> p) {
		return productDao.addList(p);
	}
	
	public List<Product> findList(){
		return productDao.findList();
	}
}
