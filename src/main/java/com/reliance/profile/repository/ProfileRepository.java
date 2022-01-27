package com.reliance.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reliance.profile.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{
		
}
