package com.example.Product.Ba04Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product.Ba0Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
