package com.wipro.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DBUtil.DBConnection;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int count = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into user_table values(?,?)");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			count = pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Could not connect....");
		}
		if(count == 0) {
			request.setAttribute("msg", "Username Already Exists! Try Again...");
			request.getRequestDispatcher("RegisterUser.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "User Successfully Registered! Please Login...");
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
	}

}
