package com.reliance.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.profile.model.Profile;
import com.reliance.profile.service.ProfileService;

@RestController
@RequestMapping("/api")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/profiles")
	public List<Profile> getProfiles() {
		List<Profile> profiles = profileService.getProfiles();
		return profiles;
	}
	
	@GetMapping(path="/profiles/{id}")
	public void getProfileDetail(@PathVariable("id") String id) {
		// TODO call service to fetch profile records
	}
	
	@PostMapping("/profiles")
	public void createProfile() {
		
	}
	
	@PutMapping("/profiles/{id}")
	public void updateProfile() {
		
	}
	
	@DeleteMapping("/profiles/{id}")
	public void deleteProfile() {
		
	}
	
	
	

}
