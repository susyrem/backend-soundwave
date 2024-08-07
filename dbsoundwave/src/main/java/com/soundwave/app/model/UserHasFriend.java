package com.soundwave.app.model;

import java.io.Serializable;

import com.soundwave.app.model.compound_key.UserFriendKey;

import jakarta.persistence.*;

@Entity
@Table(name="user_has_friend")
public class UserHasFriend implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserFriendKey id;
	
	
	@ManyToOne
	@MapsId("idUser1")
    @JoinColumn(name = "id_user1")
	private User idUser1;
	
	@ManyToOne
	@MapsId("idUser2")
    @JoinColumn(name = "id_user2")
	private User idUser2;
	
	@Column(name="status")
	private boolean status;

	public UserHasFriend(UserFriendKey id, User idUser1, User idUser2, boolean status) {
		this.id = id;
		this.idUser1 = idUser1;
		this.idUser2 = idUser2;
		this.status = status;
	}

	public UserFriendKey getId() {
		return id;
	}

	public void setId(UserFriendKey id) {
		this.id = id;
	}

	public User getIdUser1() {
		return idUser1;
	}

	public void setIdUser1(User idUser1) {
		this.idUser1 = idUser1;
	}

	public User getIdUser2() {
		return idUser2;
	}

	public void setIdUser2(User idUser2) {
		this.idUser2 = idUser2;
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
		builder.append("UserHasFriend [id=");
		builder.append(id);
		builder.append(", idUser1=");
		builder.append(idUser1);
		builder.append(", idUser2=");
		builder.append(idUser2);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}
