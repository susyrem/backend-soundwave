package com.soundwave.app.model;

import java.io.Serializable;

import com.soundwave.app.model.compound_key.UserFriendKey;

import jakarta.persistence.*;

@Entity
@Table(name="user_has_friend")
public class UserHasFriend implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserFriendKey userHasFriendId;
	
	
	@ManyToOne
	@MapsId("userId1")
    @JoinColumn(name = "user_id1")
	private User userId1;
	
	@ManyToOne
	@MapsId("userId2")
    @JoinColumn(name = "user_id2")
	private User userId2;
	
	@Column(name="status")
	private boolean status;

	public UserHasFriend(UserFriendKey userHasFriendId, User userId1, User userId2, boolean status) {
		this.userHasFriendId = userHasFriendId;
		this.userId1 = userId1;
		this.userId2 = userId2;
		this.status = status;
	}

	public UserFriendKey getId() {
		return userHasFriendId;
	}

	public void setId(UserFriendKey userHasFriendId) {
		this.userHasFriendId = userHasFriendId;
	}

	public UserFriendKey getUserHasFriendId() {
		return userHasFriendId;
	}

	public void setUserHasFriendId(UserFriendKey userHasFriendId) {
		this.userHasFriendId = userHasFriendId;
	}

	public User getUserId1() {
		return userId1;
	}

	public void setUserId1(User userId1) {
		this.userId1 = userId1;
	}

	public User getUserId2() {
		return userId2;
	}

	public void setUserId2(User userId2) {
		this.userId2 = userId2;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserHasFriend [userHasFriendId=");
		builder.append(userHasFriendId);
		builder.append(", userId1=");
		builder.append(userId1);
		builder.append(", userId2=");
		builder.append(userId2);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}


	
}
