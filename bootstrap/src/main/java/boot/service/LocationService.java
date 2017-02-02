package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.LocationRepository;
import boot.model.Location;

@Service
@Transactional
public class LocationService  {
	private final LocationRepository locationRepository;

	public LocationService(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	public List<Location> findAll() {
		List<Location> locations = new ArrayList<Location>();
		for (Location location : locationRepository.findAll()) {
			locations.add(location);
		}
		return locations;
	}
	public void save(Location location){
		locationRepository.save(location);
	}
	public void delete(int id){
		locationRepository.delete(id);
	}
	public Location findLocation(int id){
		return locationRepository.findOne(id);
	}
}
