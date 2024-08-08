package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.Reaction;

import jakarta.persistence.EmbeddedId;

public interface ReactionRepository extends CrudRepository<Reaction, EmbeddedId> {

}