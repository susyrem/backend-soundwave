package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.Profile;


public interface ProfileRepository extends CrudRepository<Profile, Long> {
	

}
