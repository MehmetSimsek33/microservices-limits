package com.in28minutes.restfull.restfullwebservice.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BrandController {

	
	private BrandRepository brandRepository;
	
	
	@GetMapping("/brands")
	public List<Brand> retrieveAllUsers() {
		return brandRepository.findAll();
	}
}
