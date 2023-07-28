package com.example.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Vehicle.Enitity.BikeEntity;
import com.example.Vehicle.Repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository repo;

	public String addDetails(BikeEntity c) {
		repo.save(c);
		return "Success";
	}

	public String addList(List<BikeEntity> c) {
		repo.saveAll(c);
		return "List Successfully Save";
	}

	public BikeEntity id(int c) {
		return repo.findById(c).get();
	}

	public List<BikeEntity> alldetails() {
		return repo.findAll();
	}

	public String deleteid(int c) {
		repo.deleteById(c);
		return "Deleted SuccessFully";

	}

	public String update(BikeEntity c) {
		repo.save(c);
		return "Updated Successfully";
	}

	public BikeEntity updateData(BikeEntity c, int a) {
		BikeEntity x = repo.findById(a).get();
		x.setBrand(x.getBrand());
		return repo.save(x);
	}
}
