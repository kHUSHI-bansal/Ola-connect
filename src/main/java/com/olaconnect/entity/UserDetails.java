package com.olaconnect.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class UserDetails {
	@Id
	private UUID id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String username;
	private String gender;
	private long phonenumber;
	private String photoaddress;
	private String dob;
	public UserDetails(UUID id, String firstname, String lastname, String email, String password, String username,
			String gender, long phonenumber, String photoaddress, String dob) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.photoaddress = photoaddress;
		this.dob = dob;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhotoaddress() {
		return photoaddress;
	}
	public void setPhotoaddress(String photoaddress) {
		this.photoaddress = photoaddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
