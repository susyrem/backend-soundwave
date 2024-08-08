package com.soundwave.app.model;


import jakarta.persistence.*;

@Entity
@Table(name="notifications")
public class Notification { 
	
	public enum NotificationType{
		NEW_POST
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long notificationId;
	
	@Column(name="post_id", columnDefinition = "Long", nullable = false)
	private Long postId;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type", nullable=false)
	private NotificationType type;
	
	public Notification() {
		
	}
	
	public Notification(Long notificationId, Long postId, NotificationType type) {
		super();
		this.notificationId=notificationId;
		this.postId=postId;
		this.type=type;
		
	}

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public NotificationType getType() {
		return type;
	}

	public void setType(NotificationType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Notification [notificationId=");
		builder.append(notificationId);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

	
	

}
