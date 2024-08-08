package com.soundwave.app.model;

import java.io.Serializable;

import com.soundwave.app.model.compound_key.ReactionPostKey;


import jakarta.persistence.*;

@Entity
@Table(name="reactions")
public class Reaction implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public enum ReactionType{
		LIKE
	}
	
	@EmbeddedId
	private ReactionPostKey reactionId;
	
	@ManyToOne
	@MapsId("postId")
    @JoinColumn(name = "post_id")
	private Post postId;
	
	@ManyToOne
	@MapsId("userId")
    @JoinColumn(name = "user_id")
	private User userId;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type", nullable=false)
	private ReactionType type;
	
	
	public Reaction() {
		
	}

	public Reaction(ReactionPostKey ReactionId, Post postId, User userId, ReactionType type) {
		super();
		this.reactionId = ReactionId;
		this.postId = postId;
		this.userId = userId;
		this.type = type;

	}

	public ReactionPostKey getReactionId() {
		return reactionId;
	}

	public void setReactionId(ReactionPostKey reactionId) {
		this.reactionId = reactionId;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public ReactionType getType() {
		return type;
	}

	public void setType(ReactionType type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reaction [reactionId=");
		builder.append(reactionId);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

	
	
}
