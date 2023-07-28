package com.example6.Flipkart.ba02.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example6.Flipkart.ba01.Entity.OrderEntity;
import com.example6.Flipkart.ba03.Service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService ordSer;

	@RequestMapping(value = "/Insert")
	public String postData(@RequestBody OrderEntity oe) {
		return ordSer.postData(oe);
	}

	@RequestMapping(value = "/getCity&Name")
	public List<String> getCityandProduct() {
		return ordSer.getCityandProduct();
	}
}
