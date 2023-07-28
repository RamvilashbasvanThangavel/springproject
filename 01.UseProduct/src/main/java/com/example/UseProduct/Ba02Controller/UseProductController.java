package com.example.UseProduct.Ba02Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.UseProduct.Ba01Entity.Product;

@RestController
@RequestMapping(value = "/UseProduct")
public class UseProductController {
	@Autowired
	RestTemplate rT;

	@GetMapping(value = "/getProductWithTax")
	public List<Product> getWithTax() {
		String url1 = "http://localhost:8080/Product/getAllListofProduct";
		String url2 = "http://localhost:8081/GST/getPercentByHsnNum/";

		ResponseEntity<List<Product>> response1 = rT.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> prdt = response1.getBody();

		for (Product pr : prdt) {
			int hsn = pr.getHsn();
			ResponseEntity<Integer> response2 = rT.exchange(url2 + hsn, HttpMethod.GET, null, Integer.class);
			int percent = response2.getBody();
			pr.setPrice(pr.getPrice() + pr.getPrice() * percent / 100);
		}
		return prdt;

	}
}
