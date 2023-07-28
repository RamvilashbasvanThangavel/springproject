package com.example.UseProduct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProductApp {

	@Bean
	RestTemplate rT() {
		return new RestTemplate();
	}
}
