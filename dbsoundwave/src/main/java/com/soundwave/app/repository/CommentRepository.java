package com.soundwave.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.soundwave.app.model.Comment;



public interface CommentRepository extends CrudRepository<Comment, Long> {
	

}
