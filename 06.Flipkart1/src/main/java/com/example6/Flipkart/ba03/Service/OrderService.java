package com.example6.Flipkart.ba03.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example6.Flipkart.ba01.Entity.OrderEntity;
import com.example6.Flipkart.ba04.Dao.OrderDao;

@Service
public class OrderService {
	@Autowired
	OrderDao ordDao;

	public String postData(OrderEntity oe) {
		return ordDao.postData(oe);
	}

	public List<String> getCityandProduct() {
		return ordDao.getCityandProduct();
	}
}
