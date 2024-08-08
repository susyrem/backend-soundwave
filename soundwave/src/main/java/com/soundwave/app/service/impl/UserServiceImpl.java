package com.soundwave.app.service.impl;


import org.springframework.stereotype.Service;

import com.soundwave.app.model.User;
import com.soundwave.app.repository.UserRepository;
import com.soundwave.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User createUser(User user) {
		User newUser = userRepository.save( user );
		return newUser;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllActiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllInactiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllUser(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}