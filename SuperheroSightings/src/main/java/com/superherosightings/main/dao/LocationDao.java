package com.superherosightings.main.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.superherosightings.main.dto.Location;
import com.superherosightings.main.dto.Superhero;
import com.superherosightings.main.dto.SuperheroLocation;

@Service
public interface LocationDao {
	
	void createLocation(Location location);
	
	Location getLocationById(Integer locationId);
	
	List<Location> getAllLocations();
	
	void deleteLocationById(Integer locationId);
	
	void deleteAllLocations();
	
	void updateLocation(Location location);
	
	List<SuperheroLocation> getAllSightings();
	
	List<SuperheroLocation> getAllSightingsByDate(LocalDate date);
	
	void deleteAll();
	
	List<Location> getLocationsBySuperhero(Superhero superhero);
	
	
}
