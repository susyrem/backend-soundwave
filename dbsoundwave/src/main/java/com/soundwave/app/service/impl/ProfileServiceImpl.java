package com.soundwave.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soundwave.app.model.Profile;
import com.soundwave.app.repository.ProfileRepository;
import com.soundwave.app.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
/*
	public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Optional<Profile> getProfileById(Long id) {
        return profileRepository.findById(id);
    }

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile updateProfile(Long id, Profile profileDetails) {
        return profileRepository.findById(id)
                .map(profile -> {
                    profile.setName(profileDetails.getName());
                    profile.setDescription(profileDetails.getDescription());
                    profile.setUserImg(profileDetails.getUserImg());
                    profile.setBirthday(profileDetails.getBirthday());
                    profile.setLocation(profileDetails.getLocation());
                    profile.setUserId(profileDetails.getUserId());
                    return profileRepository.save(profile);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Profile not found with id " + id));
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
*/

	@Override
	public Profile createProfile(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getProfileById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getProfilebyUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateProfile(Profile profile, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}
}
