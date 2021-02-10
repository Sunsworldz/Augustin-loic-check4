package com.checkpoint.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkpoint.Entities.Testimonies;
import com.checkpoint.Repository.TestimoniesRepository;


@Service
public class TestimoniesService {
	
	@Autowired
	TestimoniesRepository testimoniesRepository;
	
    public List<Testimonies> getAllTestimonies() {
        return testimoniesRepository.findAll();
    }
    
    public Testimonies createTestimonies(Testimonies testimonies) {
    	return testimoniesRepository.save(testimonies);
    }
    
    public boolean deleteTestimonies(Long id) {
    	testimoniesRepository.deleteById(id);
    	return true;
    }

}
