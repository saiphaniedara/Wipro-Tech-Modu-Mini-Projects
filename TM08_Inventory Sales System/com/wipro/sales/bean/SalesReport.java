package com.wipro.sales.bean;
import java.util.Date;
public class SalesReport {
	private String salesID;
	private Date salesDate;
	private String productID;
	private String productName;
	private int quantitySold;
	private double productUnitPrice;
	private double salesPricePerUnit;
	private double profitAmount;
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
	public void setProductName(String pname)
	{
		productName=pname;
	}
	public void setQuantitySold(int qs)
	{
		quantitySold=qs;
	}
	public void setProductUnitPrice(double pup)
	{
		productUnitPrice=pup;
	}
	public void setSalesPricePerUnit(double spu)
	{
		salesPricePerUnit=spu;
	}
	public void setProfitAmount(double pa)
	{
		profitAmount=pa;
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
	public String getProductName()
	{
		return productName;
	}
	public int getQuantitySold()
	{
		return quantitySold;
	}
	public double getProductUnitPrice()
	{
		return productUnitPrice;
	}
	public double getSalesPricePerUnit()
	{
		return salesPricePerUnit;
	}
	public double getProfitAmount()
	{
		return profitAmount;
	}
}
