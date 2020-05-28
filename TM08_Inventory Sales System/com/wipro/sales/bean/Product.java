package com.wipro.sales.bean;

public class Product {
	private String productID;
	private String productName;
	private int quantityOnHand;
	private double productUnitPrice;
	private int reorderLevel;
	public void setProductID(String pid)
	{
		productID=pid;
	}
	public void setProductName(String pname)
	{
		productName=pname;
	}
	public void setQuantityOnHand(int qoh)
	{
		quantityOnHand=qoh;
	}
	public void setProductUnitPrice(double pup)
	{
		productUnitPrice=pup;
	}
	public void setReorderLevel(int rol)
	{
		reorderLevel=rol;
	}
	public String getProductID()
	{
		return productID;
	}
	public String getProductName()
	{
		return productName;
	}
	public int getQuantityOnHand()
	{
		return quantityOnHand;
	}
	public double getProductUnitPrice()
	{
		return productUnitPrice;
	}
	public int getReorderLevel()
	{
		return reorderLevel;
	}
	
}
