package com.soundwave.app.model;

import jakarta.persistence.*;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long commentId;
	
	@Column(name="content", columnDefinition = "Text", nullable = false)
	private String content;
	
	@Column(name="user_id", columnDefinition = "Long", nullable = false)
	private Long userId;

public Comment() {
		
	}
	
	public Comment(Long commentId, String content, Long userId) {
		super();
		this.commentId = commentId;
		this.content = content;
		this.userId = userId;
}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
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
		builder.append("Comment [commentId=");
		builder.append(commentId);
		builder.append(", content=");
		builder.append(content);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}

	
	
}

