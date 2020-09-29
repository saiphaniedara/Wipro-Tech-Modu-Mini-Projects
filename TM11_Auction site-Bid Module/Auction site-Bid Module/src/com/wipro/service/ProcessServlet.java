package com.wipro.service;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.BidDetails;

/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String itemId = request.getParameter("item_id");
		String itemName = request.getParameter("item_name");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		double amount = Double.parseDouble(request.getParameter("bid_amount"));
		String aip = request.getParameter("cbox");
		boolean checked = (aip != null)?true:false;
		BidDetails bd = new BidDetails(itemId,itemName,name,email,amount,checked);
		request.setAttribute("details", bd);
		request.getRequestDispatcher("DisplayBidDetails.jsp").forward(request, response);
	}

}
