package com.locationapp.locationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationapp.locationEntity.Location;
import com.locationapp.locationrepos.LocationRepository;


@Controller
public class LocationRestController {
	@Autowired
	LocationRepository service;
	
	@RequestMapping("/create")
	public String show() {
		return "createlocation";
		
	}
	
	@RequestMapping("/saveloc")
	public String addlocation(@ModelAttribute("location") Location location,ModelMap modelmap) {
		Location saved=service.save(location);
		String msg="location saved with id" + " "+ saved.getId();
		modelmap.addAttribute("msg", msg);
		
		return "createlocation";
	}
	
	@RequestMapping("/displaylocation")
	public String getAllLocation(ModelMap modelmap){
		
		List<Location> locations = service.findAll();
		modelmap.addAttribute("locations",locations);
		return "displaylocation";
	}
	
	@RequestMapping("/deletelocation")
	public String deleteone(@RequestParam("id") int id,ModelMap modelmap) {
		Location location = service.getOne(id);
		service.delete(location);

		List<Location> locations = service.findAll();
		modelmap.addAttribute("locations",locations);
		
		return "displaylocation";
	}
	
	@RequestMapping("/showlocation")
	public String updateshow(@RequestParam("id") int id,ModelMap modelmap) {
		
		Location location = service.getOne(id);
		modelmap.addAttribute("location", location);
		return "editlocation";		
		}
	@RequestMapping ("/updatelocation")
	public String updateedit(@ModelAttribute("location") Location location,ModelMap modelmap) {
		Location saved = service.save(location);

		List<Location> locations = service.findAll();
		modelmap.addAttribute("locations",locations);
		return "displaylocation";
		
	}
}
