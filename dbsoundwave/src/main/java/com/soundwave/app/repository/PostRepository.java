package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	

}



