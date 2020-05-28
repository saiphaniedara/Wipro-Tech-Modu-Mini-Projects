package com.wipro.sales.main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import com.wipro.sales.bean.*;
import com.wipro.sales.service.*;
public class SalesApplication {
	public static void main(String[] args) throws ParseException
	{	
		Administrator ad=new Administrator();
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1. Insert Stock");
		System.out.println("2. Delete Stock");
		System.out.println("3. Insert Sales");
		System.out.println("4. View Sales Report");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			Product p=new Product();
			System.out.println("Enter Product Name : ");
			p.setProductName(sc.next());
			System.out.println("Enter Quantity on hand : ");
			p.setQuantityOnHand(sc.nextInt());
			System.out.println("Enter Product Unit Price : ");
			p.setProductUnitPrice(sc.nextDouble());
			System.out.println("Enter Reorder Level : ");
			p.setReorderLevel(sc.nextInt());
			System.out.println(ad.insertStock(p));
			break;
		case 2:
			System.out.println("Enter Product ID : ");
			System.out.println(ad.deleteStock(sc.next()));
			break;
		case 3:
			Sales s=new Sales();
			System.out.println("Enter Product ID : ");
			s.setProductID(sc.next());
			System.out.println("Enter Quantity Sold : ");
			s.setQuantitySold(sc.nextInt());
			System.out.println("Enter Sales Date : ");
			String d=sc.next();
			SimpleDateFormat format=new SimpleDateFormat("dd-MMM-yyyy");
			s.setSalesDate(format.parse(d));
			System.out.println("Enter Sales Price per Unit : ");
			s.setSalesPricePerUnit(sc.nextDouble());
			System.out.println(ad.insertSales(s));
			break;
		case 4:
			ArrayList<SalesReport> sr=ad.getSalesReport();
			Iterator<SalesReport> it=sr.listIterator();
			while(it.hasNext())
			{
				SalesReport sale=it.next();
				System.out.printf("%6s %10s %6s %20s %4d %9.2f %9.2f %9.2f",sale.getSalesID(),sale.getSalesDate(),sale.getProductID(),sale.getProductName(),sale.getQuantitySold(),sale.getProductUnitPrice(),sale.getSalesPricePerUnit(),sale.getProfitAmount());
				System.out.println();
			}
			break;
		default:
			System.out.println("Invalid Option");
			break;	
		}
	}
}
