package com.locationapp.locationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationapp.locationEntity.Location;
import com.locationapp.locationrepos.LocationRepository;


@Service
public class LocationappServiceImpl implements locationservice {

	@Autowired
	LocationRepository locationrepo;
	
	@Override
	public List<Location> getallLocation() {
		// TODO Auto-generated method stub
		return locationrepo.findAll();
	}

	@Override
	public Location getOneLocation(int id) {
		// TODO Auto-generated method stub
		return locationrepo.findById(id).get();
	}

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return locationrepo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return locationrepo.save(location);
	}

	@Override
	public void deleteLocation(int id) {
		// TODO Auto-generated method stub
locationrepo.deleteById(id);
	}

}
