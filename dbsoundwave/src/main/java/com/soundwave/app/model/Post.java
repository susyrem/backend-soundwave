package com.soundwave.app.model;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="posts")

public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long postId;
	
	@Column (name="content", columnDefinition = "LongText", nullable=false)
	private String content;
	
	@Column (name="url", columnDefinition = "VARCHAR", length = 200, nullable=true)	
	private String url;
	
	@Column (name="created_at", columnDefinition = "LocalDateTime", nullable=false)
	private LocalDateTime createdAt;
	
	@Column (name="user_id", columnDefinition = "Long", nullable=false)
	private Long userId;

	
	public Post() {
		
	}
	
	public Post(Long postId, String content, String url, LocalDateTime createdAt,
			Long userId) {
		super();
		this.postId = postId;
		this.content = content;
		this.url = url;
		this.createdAt = createdAt;
		this.userId = userId;
}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Post [postId=");
		builder.append(postId);
		builder.append(", content=");
		builder.append(content);
		builder.append(", url=");
		builder.append(url);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}


	
	
}