package com.example.Vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Vehicle.Dao.CarDao;
import com.example.Vehicle.Enitity.CarEntity;
import com.example.Vehicle.Exception.CarException;

import java.util.*;

@Service
public class CarService {
	@Autowired
	CarDao cardao;

	public String addDetails(CarEntity c) {
		return cardao.addDetails(c);
	}

	public String addList(List<CarEntity> c) {
		return cardao.addList(c);
	}

	public CarEntity id(int c) {
		return cardao.id(c);
	}

	public List<CarEntity> alldetails() {
		return cardao.alldetails();
	}

	public String deleteid(int c) {
		return cardao.deleteid(c);
	}

	public String deleteAllList() {
		return cardao.deleteAllList();
	}

	public List<CarEntity> getByName(String name) throws CarException, Exception {
		if (cardao.getByName(name).isEmpty()) {
			throw new CarException("Not Valid Car Name");
		} else {
			return cardao.getByName(name);
		}
	}

}
