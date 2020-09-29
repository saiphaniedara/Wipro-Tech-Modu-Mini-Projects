package com.wipro.bean;

public class BidDetails {
	private String itemId;
	private String itemName;
	private String name;
	private String email;
	private double amount;
	private boolean checked;
	public BidDetails(String itemId, String itemName, String name, String email, double amount, boolean checked) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.name = name;
		this.email = email;
		this.amount = amount;
		this.checked = checked;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
