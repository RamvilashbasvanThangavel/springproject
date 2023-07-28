package com.example.Vehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Vehicle.Enitity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Integer> {

}
