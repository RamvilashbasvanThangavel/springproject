package com.example.Vehicle.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehicle.Enitity.BikeEntity;
import com.example.Vehicle.Service.BikeService;

@RestController
@RequestMapping(value = "/Bike")
public class BikeController {
	@Autowired
	BikeService bikeSer;

	@PostMapping(value = "/Insert")
	public String addDetails(@RequestBody BikeEntity c) {
		return bikeSer.addDetails(c);
	}

	@PostMapping(value = "/List")
	public String addList(@RequestBody List<BikeEntity> c) {
		return bikeSer.addList(c);
	}

	@GetMapping(value = "/GetId/{c}")
	public BikeEntity id(@PathVariable int c) {
		return bikeSer.id(c);
	}

	@GetMapping(value = "/AllDetails")
	public List<BikeEntity> alldetails() {
		return bikeSer.alldetails();
	}

	@DeleteMapping(value = "/Delete/{c}")
	public String deleteid(@PathVariable int c) {
		return bikeSer.deleteid(c);
	}

	@PutMapping(value = "/Update")
	public String update(@RequestBody BikeEntity c) {
		return bikeSer.update(c);
	}

	@PatchMapping(value = "/UpdatedbyId/{a}")
	public String updataData(@RequestBody BikeEntity c, @PathVariable int a) {
		bikeSer.updateData(c, a);
		return "updated";
	}

}
