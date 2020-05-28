package com.wipro.sales.dao;
import com.wipro.sales.bean.*;
import com.wipro.sales.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
public class SalesDao {
	Connection con;
	PreparedStatement pstmt;
	public int insertSales(Sales sales) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("insert into TBL_SALES values(?,?,?,?,?)");
		java.sql.Date sd=new java.sql.Date(sales.getSalesDate().getTime());
		pstmt.setString(1, sales.getSalesID());
		pstmt.setDate(2, sd);
		pstmt.setString(3, sales.getProductID());
		pstmt.setInt(4, sales.getQuantitySold());
		pstmt.setDouble(5, sales.getSalesPricePerUnit());
		int row=pstmt.executeUpdate();
		con.close();
		return row;
	}
	public String generateSalesID(Date salesDate) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("select seq_sales_id.nextval from dual");
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int x=rs.getInt(1);
		String y=salesDate.toString();
		con.close();
		return y.substring(y.length()-2)+Integer.toString(x);
	}
	public ArrayList<SalesReport> getSalesReport() throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("select * from V_SALES_REPORT");
		ResultSet rs=pstmt.executeQuery();
		ArrayList<SalesReport> sr= new ArrayList<SalesReport>();
		SalesReport s=new SalesReport();
		while(rs.next())
		{
			s.setSalesID(rs.getString(1));
			s.setSalesDate(rs.getDate(2));
			s.setProductID(rs.getString(3));
			s.setProductName(rs.getString(4));
			s.setQuantitySold(rs.getInt(5));
			s.setProductUnitPrice(rs.getDouble(6));
			s.setSalesPricePerUnit(rs.getDouble(7));
			s.setProfitAmount(rs.getDouble(8));
			sr.add(s);
		}
		con.close();
		return sr;
	}
}
