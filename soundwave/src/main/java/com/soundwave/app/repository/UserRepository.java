package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	

}