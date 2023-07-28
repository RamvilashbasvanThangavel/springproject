package com.example.Bank.Ba05Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Bank.Ba01Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

	@Query(value = "Select ifsc from bank where branch=?", nativeQuery = true)
	public String getIfsc(String branch);

}
