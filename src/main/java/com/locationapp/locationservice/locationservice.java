package com.locationapp.locationservice;

import java.util.List;

import com.locationapp.locationEntity.Location;


public interface locationservice {
	
List<Location> getallLocation();
Location getOneLocation(int id);
Location saveLocation(Location location);
Location updateLocation(Location location);
void deleteLocation(int id);

}
