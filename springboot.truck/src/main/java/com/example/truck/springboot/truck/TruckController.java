package com.example.truck.springboot.truck;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TruckController {
	@GetMapping("/Trucks")
	public List<Truck> getAllTrucks() {
		return Arrays.asList(
				new Truck(1, "Truck1", "Food"));
	}
}