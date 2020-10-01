package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table")
public class Employee {
	private String name;
	@Id
	private int id;
	private String gender;
	private String designation;
	private double salary;
	private String city;
	private String emailId;
	private String mobno;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, String gender, String designation, double salary, String city, String emailId,
			String mobno) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		this.emailId = emailId;
		this.mobno = mobno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + ", city=" + city + ", emailId=" + emailId + ", mobno=" + mobno + "]";
	}
}
