package com.soundwave.app.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="user_has_friend")
public class UserHasFriend implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Long UserFriendKey id;
	
	
	@ManyToOne
	@MapsId("idUser1")
    @JoinColumn(name = "id_user1")
	private IdUser1 idUser1;
	
	@ManyToOne
	@MapsId("idUser2")
    @JoinColumn(name = "id_user2")
	private IdUser2 idUser2;
	
	@JsonIgnoreProperties()

}
