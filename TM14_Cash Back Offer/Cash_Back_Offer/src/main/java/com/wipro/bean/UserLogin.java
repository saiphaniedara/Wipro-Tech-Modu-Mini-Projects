package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin {
	@Id
	private String custId;
	private String password;
	private double balance;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
}
