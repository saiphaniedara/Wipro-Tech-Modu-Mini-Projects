package com.wipro.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		Employee e = (Employee)sess.getAttribute("employee");
		EmployeeDAO dao = new EmployeeDAO();
		dao.deleteEmployee(e);
		request.setAttribute("msg", "Employee Deleted Successfully");
		request.getRequestDispatcher("HomePage.jsp").forward(request, response);
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
		request.getRequestDispatcher("DeleteEmployee.jsp").forward(request, response);
		}
		catch(Exception ex) {
			request.setAttribute("msg", "No such Employee Found with entered Id! Try again...");
			request.getRequestDispatcher("DeleteEmployee.jsp").forward(request, response);
		}
	}

}
