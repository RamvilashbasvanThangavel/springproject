package com.example.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Vehicle.Enitity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

	@Query(value = "Select * from car where brand=?", nativeQuery = true)
	public List<CarEntity> getByName(String brand);
}
