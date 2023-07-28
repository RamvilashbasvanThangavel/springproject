package com.example.Product.Ba01Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Ba02Service.ProductService;
import com.example.Product.Ba0Entity.Product;

@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	ProductService productSer;

	@PostMapping(value = "/listPosting")
	public String addList(@RequestBody List<Product> p) {
		return productSer.addList(p);
	}

	@GetMapping(value = "/getAllListofProduct")
	public List<Product> findList() {
		return productSer.findList();
	}

}
