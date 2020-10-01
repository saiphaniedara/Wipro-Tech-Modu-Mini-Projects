package com.wipro.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> l = dao.selectAllEmployees();
		if(l.size()==0) {
			request.setAttribute("msg", "No Employee Details Found!");
			request.getRequestDispatcher("DisplayEmployees.jsp").forward(request, response);
		}
		else {
		request.setAttribute("employeeList", l);
		request.getRequestDispatcher("DisplayEmployees.jsp").forward(request, response);
		}
			
	}

}
