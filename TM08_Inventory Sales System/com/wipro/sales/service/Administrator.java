package com.wipro.sales.service;
import java.util.ArrayList;
import com.wipro.sales.dao.*;
import com.wipro.sales.util.DBUtil;
import com.wipro.sales.bean.*;
import java.sql.*;
import java.util.Date;
public class Administrator {
	public String insertStock(Product p)
	{
		if( p!=null && p.getProductName().length()>=2 )
		{
			try
			{
			StockDao sd=new StockDao();
			p.setProductID(sd.generateProductID(p.getProductName()));
			int row=sd.insertStock(p);
			if(row>0)
			{
				return p.getProductID();
			}
			else
			{
				return "Data not valid for insertion";
			}
			}
			catch(Exception e)
			{
				return e.getMessage();
			}
		}
		else
		{
			return "Data not valid for insertion";
		}
	}
	public String deleteStock(String pid)
	{
		StockDao sd=new StockDao();
		try
		{
		int row=sd.deleteStock(pid);
		if(row>0)
		{
			return "deleted";
		}
		else
		{
			return "record cannot be deleted";
		}
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	public String insertSales(Sales s)
	{
		try
		{
			if(s!=null)
			{
				Connection con=DBUtil.getDBConnection();
				PreparedStatement pstmt=con.prepareStatement("select * from TBL_STOCK where Product_ID=?");
				pstmt.setString(1,s.getProductID());
				ResultSet rs=pstmt.executeQuery();
				if(rs==null)
				{
					con.close();
					return "Unknown Product for Sales";
				}
				else
				{
					rs.next();
					if(s.getQuantitySold()>rs.getInt(3))
					{
						con.close();
						return "Not enough stock on hand for sales";
					}
					else
					{
						if(s.getSalesDate().compareTo(new Date())==1)
						{
							
							con.close();
							return "Invalid Date";
						}
						else
						{
							SalesDao sd=new SalesDao();
							s.setSalesID(sd.generateSalesID(s.getSalesDate()));
							int row=sd.insertSales(s);
							if(row>0)
							{
								int r=new StockDao().updateStock(s.getProductID(), s.getQuantitySold());
								if(r>0)
								{
									con.close();
									return "Sales Completed";
								}
								else
								{
									con.close();
									return "Error";
								}
							}
							else
							{
								con.close();
								return "Error";
							}
						}
					}
				}
			}
			else
			{
				return "Object not valid for insertion";
			}
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	public ArrayList<SalesReport> getSalesReport()
	{
		try
		{
			ArrayList<SalesReport> ar=new SalesDao().getSalesReport();
			return ar;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
