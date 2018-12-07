package com.locationapp.locationrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationapp.locationEntity.Location;



public interface LocationRepository extends JpaRepository<Location, Integer> {

}
