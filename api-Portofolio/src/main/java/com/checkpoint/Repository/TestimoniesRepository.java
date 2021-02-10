package com.checkpoint.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.checkpoint.Entities.Testimonies;


@Repository
public interface TestimoniesRepository extends JpaRepository<Testimonies, Long> {

}
