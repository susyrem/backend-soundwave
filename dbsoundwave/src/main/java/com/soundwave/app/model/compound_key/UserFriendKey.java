package com.soundwave.app.model.compound_key;

import jakarta.persistence.*;
import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class UserFriendKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="id_user1")
	private Long idUser1;
	@Column(name="id_user")
	private Long idUser2;
	

	
	public UserFriendKey(Long idUser1, Long idUser2, boolean status) {
		super();
		this.idUser1=idUser1;
		this.idUser2=idUser2;

	}



	public Long getIdUser1() {
		return idUser1;
	}



	public void setIdUser1(Long idUser1) {
		this.idUser1 = idUser1;
	}



	public Long getIdUser2() {
		return idUser2;
	}



	public void setIdUser2(Long idUser2) {
		this.idUser2 = idUser2;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
