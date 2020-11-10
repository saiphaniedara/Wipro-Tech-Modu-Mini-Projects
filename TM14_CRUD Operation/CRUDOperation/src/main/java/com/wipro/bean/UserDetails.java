package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Column(unique = true)
	private String empId;
	@Id
	private String username;
	private String password;
	private String email;
	public UserDetails(String empId, String username, String password, String email) {
		super();
		this.empId = empId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDetails [empId=" + empId + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
}
