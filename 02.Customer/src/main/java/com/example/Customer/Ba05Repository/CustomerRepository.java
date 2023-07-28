package com.example.Customer.Ba05Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer.Ba01Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
