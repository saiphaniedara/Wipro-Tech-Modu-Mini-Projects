package com.wipro.sales.dao;
import com.wipro.sales.util.*;
import com.wipro.sales.bean.*;
import java.sql.*;
public class StockDao {
	Connection con;
	PreparedStatement pstmt;
	public int insertStock(Product stock) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("insert into TBL_STOCK values(?,?,?,?,?)");
		pstmt.setString(1, stock.getProductID());
		pstmt.setString(2, stock.getProductName());
		pstmt.setInt(3, stock.getQuantityOnHand());
		pstmt.setDouble(4, stock.getProductUnitPrice());
		pstmt.setInt(5, stock.getReorderLevel());
		int row=pstmt.executeUpdate();
		con.close();
		return row;
	}
	public String generateProductID(String productName) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("select SEQ_PRODUCT_ID.nextval from DUAL");
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int x=rs.getInt(1);
		con.close();
		return productName.substring(0,2)+Integer.toString(x);
	}
	public int updateStock(String productID,int soldQty) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("select Quantity_On_Hand from TBL_STOCK where Product_ID=?");
		pstmt.setString(1, productID);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int qoh=rs.getInt(1);
		qoh-=soldQty;
		pstmt=con.prepareStatement("update TBL_STOCK set Quantity_On_Hand=? where Product_ID=?");
		pstmt.setInt(1, qoh);
		pstmt.setString(2, productID);
		int row=pstmt.executeUpdate();
		con.close();
		return row;
	}
	public Product getStock(String productID) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("select Quantity_On_Hand from TBL_STOCK where Product_ID=?");
		pstmt.setString(1, productID);
		ResultSet rs=pstmt.executeQuery();
		Product p=new Product();
		while(rs.next())
		{
			p.setProductID(rs.getString(1));
			p.setProductName(rs.getString(2));
			p.setQuantityOnHand(rs.getInt(3));
			p.setProductUnitPrice(rs.getDouble(4));
			p.setReorderLevel(rs.getInt(5));
		}
		con.close();
		return p;
	}
	public int deleteStock(String productID) throws Exception
	{
		con=DBUtil.getDBConnection();
		pstmt=con.prepareStatement("delete from TBL_STOCK where Product_ID=?");
		pstmt.setString(1, productID);
		int row=pstmt.executeUpdate();
		con.close();
		return row;
	}
}
