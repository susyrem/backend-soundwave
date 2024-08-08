package com.soundwave.app.model.compound_key;

import jakarta.persistence.*;
import java.io.Serializable;


@Embeddable
public class ReactionPostKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="post_id")
	private Long postId;
	@Column(name="user_id")
	private Long userId;
	

	
	public ReactionPostKey(Long postId, Long userId) {
		super();
		this.postId=postId;
		this.userId=userId;

	}



	public Long getPostId() {
		return postId;
	}



	public void setPostId(Long postId) {
		this.postId = postId;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}

