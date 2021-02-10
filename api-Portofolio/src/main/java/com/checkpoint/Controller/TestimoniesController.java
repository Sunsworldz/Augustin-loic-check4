package com.checkpoint.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkpoint.Entities.Testimonies;
import com.checkpoint.Service.TestimoniesService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TestimoniesController {
	
	@Autowired
	TestimoniesService testimoniesService;
	
	@GetMapping("/testimonies")
	 public List<Testimonies> findAllTestimonies() {
        return testimoniesService.getAllTestimonies();
    }
	
	@DeleteMapping("/testimonies/{id}")
	public boolean delete(@PathVariable Long id) {
		return testimoniesService.deleteTestimonies(id);
	}
	
	@PostMapping("/testimonies")
	public Testimonies createTestimonies(@RequestBody Testimonies testimonies) {
		return testimoniesService.createTestimonies(testimonies);
	}
	
	

}
