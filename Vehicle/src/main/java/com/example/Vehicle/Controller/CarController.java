package com.example.Vehicle.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehicle.Enitity.CarEntity;
import com.example.Vehicle.Exception.CarException;
import com.example.Vehicle.Service.CarService;

@RestController
@RequestMapping(value = "/Car")
public class CarController {
	@Autowired
	CarService carSer;

	@PostMapping(value = "/Insert")
	public String addDetails(@RequestBody CarEntity c) {
		return carSer.addDetails(c);
	}

	@PostMapping(value = "/List")
	public String addList(@RequestBody List<CarEntity> c) {
		return carSer.addList(c);
	}

	@GetMapping(value = "/GetId/{c}")
	public CarEntity id(@PathVariable int c) {
		return carSer.id(c);
	}

	@GetMapping(value = "/AllDetails")
	public List<CarEntity> alldetails() {
		return carSer.alldetails();
	}

	@DeleteMapping(value = "/Delete/{c}")
	public String deleteid(@PathVariable int c) {
		return carSer.deleteid(c);
	}

	@DeleteMapping(value = "/DeleteAllData")
	public String deleteAllList() {
		return carSer.deleteAllList();
	}

	@GetMapping(value = "/getNameInList/{name}")
	public List<CarEntity> getByName(@PathVariable String name) throws CarException, Exception {
		return carSer.getByName(name);
	}
	
	

}
