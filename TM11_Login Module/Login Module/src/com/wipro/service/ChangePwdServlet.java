package com.wipro.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DBUtil.DBConnection;

/**
 * Servlet implementation class ChangePwdServlet
 */
@WebServlet("/ChangePwdServlet")
public class ChangePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("password");
		boolean isValidUser = false;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from user_table where username=? and password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, oldpassword);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				isValidUser = true;
			}
			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println("Could not connect....");
		}
		if(isValidUser) {
			try {
				Connection con1 = DBConnection.getConnection();
				PreparedStatement pstmt1 = con1.prepareStatement("update user_table set password=? where username=?");
				pstmt1.setString(1, newpassword);
				pstmt1.setString(2, username);
				pstmt1.executeUpdate();
			}
			catch(Exception e) {
				System.out.println("Could not connect....");
			}
			request.setAttribute("msg", "Password Changed Successfully...");
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "Invalid User Credentials! Please Try Again...");
			request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
		}
	}

}
