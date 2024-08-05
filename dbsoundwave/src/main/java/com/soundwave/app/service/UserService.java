package com.soundwave.app.service;

import com.soundwave.app.model.User;

public interface UserService {
	
	User createUser(User user);
	User getUserById(Long id);
	User getUserByEmail(String email);
	Iterable<User> getAllActiveUsers();
	Iterable<User> getAllInactiveUsers();
	Iterable<User> getAllUser(boolean isActive);
	User updateUser(User user, Long id);
	void deleteUser(Long id);

}
