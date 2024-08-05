package com.soundwave.app.model;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="posts")

public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPost;
	
	@Column (name="content", columnDefinition = "LongText", nullable=false)
	private String content;
	
	@Column (name="url", columnDefinition = "VARCHAR", length = 200, nullable=true)	
	private String url;
	
	@Column (name="createdAt", columnDefinition = "LocalDateTime", nullable=false)
	private LocalDateTime createdAt;
	
	@Column (name="userId", columnDefinition = "Long", nullable=false)
	private Long userId;

	
	public Post() {
		
	}
	
	public Post(Long idPost, String content, String url, LocalDateTime createdAt,
			Long userId) {
		super();
		this.idPost = idPost;
		this.content = content;
		this.url = url;
		this.createdAt = createdAt;
		this.userId = userId;
}

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
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
		builder.append("Post [idPost=");
		builder.append(idPost);
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