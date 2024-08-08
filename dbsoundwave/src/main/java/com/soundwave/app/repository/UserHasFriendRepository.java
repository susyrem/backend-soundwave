package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.UserHasFriend;

import jakarta.persistence.EmbeddedId;

public interface UserHasFriendRepository extends CrudRepository<UserHasFriend, EmbeddedId> {

}
