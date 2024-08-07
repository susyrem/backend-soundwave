package com.soundwave.app.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table (name="profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long profileId;
	
	@Column(name="name", columnDefinition = "VARCHAR", length = 40, nullable = false)
	private String name;
	
	@Column(name = "description", columnDefinition = "Text", nullable = true)
	private String description;
	
	@Column(name = "userImg", columnDefinition = "VARCHAR", length = 400, nullable = true)
	private String userImg;
	
	@Column(name = "birthday", columnDefinition = "LocalDate", nullable = true)
	private LocalDate birthday;
	
	@Column(name = "location", columnDefinition = "VARCHAR", length = 150, nullable = true)
	private String location;
	
	@Column(name = "userId", columnDefinition = "Long", nullable = true)
	private Long userId;
	
public Profile() {
		
	}

		public Profile(Long profileId, String name, String description, String userImg, LocalDate birthday, String location,
			Long userId) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.description = description;
		this.userImg = userImg;
		this.birthday = birthday;
		this.location = location;
		this.userId = userId;
	}
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
		builder.append("Profile [profileId=");
		builder.append(profileId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", userImg=");
		builder.append(userImg);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", location=");
		builder.append(location);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
