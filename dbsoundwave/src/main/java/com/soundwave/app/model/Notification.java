package com.soundwave.app.model;

import jakarta.persistence.*;

@Entity
@Table(name="notifications")
public class Notification { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="postId", columnDefinition = "Long", nullable = false)
	private Long postId;
	
	public Notification() {
		
	}
	
	public Notification(Long id, Long postId) {
		super();
		this.id=id;
		this.postId=postId;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Notification [id=");
		builder.append(id);
		builder.append(", postId=");
		builder.append(postId);
		builder.append("]");
		return builder.toString();
	}
	
	

}
