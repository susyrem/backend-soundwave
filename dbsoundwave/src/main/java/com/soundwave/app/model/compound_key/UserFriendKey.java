package com.soundwave.app.model.compound_key;

import jakarta.persistence.*;
import java.io.Serializable;


@Embeddable
public class UserFriendKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="user_id1")
	private Long userId1;
	@Column(name="user_id2")
	private Long userId2;
	

	
	public UserFriendKey(Long userId1, Long userId2) {
		super();
		this.userId1=userId1;
		this.userId2=userId2;

	}



	public Long getUserId1() {
		return userId1;
	}



	public void setUserId1(Long userId1) {
		this.userId1 = userId1;
	}



	public Long getUserId2() {
		return userId2;
	}



	public void setUserId2(Long userId2) {
		this.userId2 = userId2;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
