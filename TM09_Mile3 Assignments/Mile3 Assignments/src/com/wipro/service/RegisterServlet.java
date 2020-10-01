package com.wipro.service;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

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
		String userid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String state = request.getParameter("state");
		String cont = request.getParameter("cont");
		String add = request.getParameter("add");
		int year = Integer.parseInt(dob.substring(0, 3));
		int mon = Integer.parseInt(dob.substring(5, 7))-1;
		int day = Integer.parseInt(dob.substring(8));
		java.util.Date d = new Date(year, mon, day);
		int count = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into users_table values(?,?,?,?,?,?,?)");
			pstmt.setString(1,userid);
			pstmt.setString(2, pwd);
			pstmt.setDate(3, new java.sql.Date(d.getTime()));
			pstmt.setString(4, gender);
			pstmt.setString(5, state);
			pstmt.setString(6, cont);
			pstmt.setString(7, add);
			count = pstmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(count == 0) {
			request.setAttribute("msg", "User already Exists...");
			request.getRequestDispatcher("RegisterPage.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "User successfully inserted! Please Login...");
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
	}
}
