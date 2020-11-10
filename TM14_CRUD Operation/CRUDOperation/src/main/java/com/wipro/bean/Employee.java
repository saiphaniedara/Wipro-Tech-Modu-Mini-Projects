package com.wipro.bean;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String gender;
	private String designation;
	private double salary;
	private String city;
	private String emailId;
	private String mobNo;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String gender, String designation, double salary, String city, String emailId,
			String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		this.emailId = emailId;
		this.mobNo = mobNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + ", city=" + city + ", emailId=" + emailId + ", mobNo=" + mobNo + "]";
	}
}
