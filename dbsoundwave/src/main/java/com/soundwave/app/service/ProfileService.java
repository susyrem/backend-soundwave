package com.soundwave.app.service;

import com.soundwave.app.model.Profile;


public interface ProfileService {

	Profile createProfile(Profile profile);
	Profile getProfileById(Long id);
	Profile getProfilebyUserId(Long userId);
	Profile updateProfile(Profile profile, Long id);
	void deleteUser(Long id);
}
