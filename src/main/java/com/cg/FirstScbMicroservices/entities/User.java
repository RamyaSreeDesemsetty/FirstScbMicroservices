package com.cg.FirstScbMicroservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "micro_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String uname;
	private String uemail;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String uname, String uemail) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.uemail = uemail;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", uemail=" + uemail + "]";
	}

}
