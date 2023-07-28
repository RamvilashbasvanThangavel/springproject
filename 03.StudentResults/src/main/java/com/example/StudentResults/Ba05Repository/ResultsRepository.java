package com.example.StudentResults.Ba05Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentResults.Ba01Entity.Results;

public interface ResultsRepository extends JpaRepository<Results, Integer> {
	

}
