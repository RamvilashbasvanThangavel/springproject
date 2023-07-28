package com.example6.Flipkart.ba05.RepoSitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example6.Flipkart.ba01.Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
