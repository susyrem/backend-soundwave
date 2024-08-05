package com.soundwave.app.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	
	@Id // Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username", length=100, nullable=false, unique=true)
	private String username;
	
	@Column(name="phone", length=10, nullable=false)
	private String phone;
	
	@Column(name="email", length=100, nullable=false, unique=true)
	private String email;
	
	@Column(name="createdat", nullable=true)
	private LocalDate createdAt;
	
	@Column(name="password", length=150, nullable=false)
	private String password;
	
	@Column(name="active", nullable=false)
	private boolean active;
	
	public User() {
		
	}

	public User(String username, String phone, String email, LocalDate createdAt, String password, boolean active) {
		super();
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.createdAt = createdAt;
		this.password = password;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", password=");
		builder.append(password);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
	
	

}
