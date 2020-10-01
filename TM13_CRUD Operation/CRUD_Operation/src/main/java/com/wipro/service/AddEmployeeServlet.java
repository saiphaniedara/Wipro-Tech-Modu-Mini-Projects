package com.wipro.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

/**
 * Servlet implementation class AddEmployeeServlet
 */
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		System.out.println(dao.addEmployee(e));
		request.setAttribute("msg", "Employee Added Successfully");
		request.getRequestDispatcher("HomePage.jsp").forward(request, response);
	}

}
