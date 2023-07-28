package com.example9.ProductDetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailsController {

	@GetMapping(value = "/getMobileDetails")
	public String mobileDetails() {
		return "Vivo mobile";
	}

}
