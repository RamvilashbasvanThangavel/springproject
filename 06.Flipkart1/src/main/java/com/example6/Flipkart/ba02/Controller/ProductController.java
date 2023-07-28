package com.example6.Flipkart.ba02.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example6.Flipkart.ba03.Service.ProductService;

@RestController
@RequestMapping(value = "/Product")
public class ProductController {
	@Autowired
	ProductService prdSer;

}
