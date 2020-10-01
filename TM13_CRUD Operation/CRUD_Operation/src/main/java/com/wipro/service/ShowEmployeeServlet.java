package com.wipro.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

/**
 * Servlet implementation class ShowEmployeeServlet
 */
public class ShowEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO dao = new EmployeeDAO();
		try {
		Employee e = dao.selectEmployee(id);
		request.setAttribute("employee", e);
		request.getRequestDispatcher("SelectEmployee.jsp").forward(request, response);
		}
		catch(Exception ex) {
			request.setAttribute("msg", "No such Employee Found with entered Id! Try again...");
			request.getRequestDispatcher("SelectEmployee.jsp").forward(request, response);
		}
	}

}
