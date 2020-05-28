package com.wipro.sales.bean;
import java.util.Date;
public class Sales {
	private String salesID;
	private Date salesDate;
	private String productID;
	private int quantitySold;
	private double salesPricePerUnit;
	public void setSalesID(String sid)
	{
		salesID=sid;
	}
	public void setSalesDate(Date sdate)
	{
		salesDate=sdate;
	}
	public void setProductID(String pid)
	{
		productID=pid;
	}
	public void setQuantitySold(int qs)
	{
		quantitySold=qs;
	}
	public void setSalesPricePerUnit(double spu)
	{
		salesPricePerUnit=spu;
	}
	public String getSalesID()
	{
		return salesID;
	}
	public Date getSalesDate()
	{
		return salesDate;
	}
	public String getProductID()
	{
		return productID;
	}
	public int getQuantitySold()
	{
		return quantitySold;
	}
	public double getSalesPricePerUnit()
	{
		return salesPricePerUnit;
	}
}
