package com.example.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Vehicle.Enitity.CarEntity;
import com.example.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRepo;

	public String addDetails(CarEntity c) {
		carRepo.save(c);
		return "Success";
	}

	public String addList(List<CarEntity> c) {
		carRepo.saveAll(c);
		return "List Successfully Save";
	}

	public CarEntity id(int c) {
		return carRepo.findById(c).get();
	}

	public List<CarEntity> alldetails() {
		return carRepo.findAll();
	}

	public String deleteid(int c) {
		carRepo.deleteById(c);
		return "Deleted SuccessFully";

	}

	public String deleteAllList() {
		carRepo.deleteAll();
		return "Deleted all List SuccessFully";
	}

	public List<CarEntity> getByName(String name) {
		return carRepo.getByName(name);
	}

}
