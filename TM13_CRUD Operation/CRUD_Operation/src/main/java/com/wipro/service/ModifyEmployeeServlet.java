package com.wipro.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

/**
 * Servlet implementation class ModifyEmployeeServlet
 */
public class ModifyEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO dao = new EmployeeDAO();
		try {
		Employee e = dao.selectEmployee(id);
		request.setAttribute("employee", e);
		request.getRequestDispatcher("ModifyEmployee.jsp").forward(request, response);
		}
		catch(Exception ex) {
			request.setAttribute("msg", "No such Employee Found with entered Id! Try again...");
			request.getRequestDispatcher("ModifyEmployee.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName(request.getParameter("name"));
		e.setId(Integer.parseInt(request.getParameter("id")));
		e.setGender(request.getParameter("gender"));
		e.setDesignation(request.getParameter("designation"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		e.setCity(request.getParameter("city"));
		e.setEmailId(request.getParameter("emailId"));
		e.setMobno(request.getParameter("mobno"));
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.modifyEmployee(e));
		request.setAttribute("msg", "Employee Details Modified Successfully");
		request.getRequestDispatcher("HomePage.jsp").forward(request, response);
	}

}
