package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	List<Location> findByStateLike(String stateName);
	
	List<Location> findByStateStartingWith(String stateName);
	
	List<Location> findByStateOrCountry(String state, String country);
	
	List<Location> findByStateAndCountry(String state, String Country);

}
