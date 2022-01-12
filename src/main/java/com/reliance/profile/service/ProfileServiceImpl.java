package com.reliance.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.profile.model.Profile;
import com.reliance.profile.repository.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public List<Profile> getProfiles() {
		List<Profile> profiles = profileRepository.findAll();
		return profiles;
		
	}

}
