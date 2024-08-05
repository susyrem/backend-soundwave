package com.soundwave.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="content", columnDefinition = "Text", nullable = false)
	private String content;
	
	private Long userId;

public Comment() {
		
	}
	
	public Comment(Long id, String content, Long userId) {
		super();
		this.id = id;
		this.content = content;
		this.userId = userId;
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		builder.append("Comment [id=");
		builder.append(id);
		builder.append(", content=");
		builder.append(content);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}
	
}

