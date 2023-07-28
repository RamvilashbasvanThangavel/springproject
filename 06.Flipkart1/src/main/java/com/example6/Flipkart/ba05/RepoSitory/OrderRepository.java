package com.example6.Flipkart.ba05.RepoSitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example6.Flipkart.ba01.Entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

	@Query(value = "select product_table.name,order_table.city,pin_code from order_table join product_table on order_table.order_id=product_table.order_fk", nativeQuery = true)
	public List<String> getCityandProduct();

}
