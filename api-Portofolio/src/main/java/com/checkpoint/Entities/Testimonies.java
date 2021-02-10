package com.checkpoint.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testimonies")
public class Testimonies {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testimonies;

    private String name;
    private String description;
    
    public Testimonies() {
    	
    }
    
    public Testimonies(String name, String description) {
    	this.name = name;
    	this.description = description;
    }

	public Long getTestimonies() {
		return testimonies;
	}

	public void setTestimonies(Long testimonies) {
		this.testimonies = testimonies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
