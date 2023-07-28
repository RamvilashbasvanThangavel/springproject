package com.example.Vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Vehicle.Dao.BikeDao;
import com.example.Vehicle.Enitity.BikeEntity;

import java.util.*;

@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;

	public String addDetails(BikeEntity c) {
		return bikedao.addDetails(c);
	}

	public String addList(List<BikeEntity> c) {
		return bikedao.addList(c);
	}

	public BikeEntity id(int c) {
		return bikedao.id(c);
	}

	public List<BikeEntity> alldetails() {
		return bikedao.alldetails();
	}

	public String deleteid(int c) {
		return bikedao.deleteid(c);
	}

	public String update(BikeEntity c) {
		return bikedao.update(c);
	}

	public String updateData(BikeEntity c, int id) {
		return bikedao.update(c);
	}

}
