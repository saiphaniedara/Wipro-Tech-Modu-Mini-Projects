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
import javax.servlet.http.HttpSession;

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
		HttpSession sess = request.getSession();
		String username = (String) sess.getAttribute("username");
		String epwd = request.getParameter("oldpwd");
		String oldpassword="";
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select password from users_table where userid=?");
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			oldpassword = rs.getString(1); 
			pstmt.close();
			con.close();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(epwd.equals(oldpassword)) {
			String npwd = request.getParameter("newpwd");
			try {
				Connection con1 = DBConnection.getConnection();
				PreparedStatement pst1 = con1.prepareStatement("update users_table set password=? where userid=?");
				pst1.setString(1, npwd);
				pst1.setString(2, username);
				pst1.executeUpdate();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			request.setAttribute("user", username);
			request.setAttribute("msg", "Password Changed Successfully...");
			request.getRequestDispatcher("success.jsp").forward(request,response);
		}
		else {
			request.setAttribute("msg","Password not updated! Entered password doesn't match with old password...");
			request.getRequestDispatcher("ChangePwd.jsp").forward(request, response);
		}
	}

}
