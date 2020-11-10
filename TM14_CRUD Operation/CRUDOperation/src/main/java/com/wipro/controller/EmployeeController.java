package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/addEmployee")
	public ModelAndView getAddPage() {
		ModelAndView mv = new ModelAndView();
		Employee emp = new Employee();
		emp.setId(dao.generateId());
		mv.addObject("emp", emp);
		mv.setViewName("AddEmployee");
		return mv;
	}
	@RequestMapping("/insertEmployee")
	public ModelAndView saveEmployee(Employee emp) {
		String msg=dao.addEmployee(emp);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		mv.setViewName("UserMenu");
		return mv;
	}
	@RequestMapping("/deleteEmployee")
	public ModelAndView findToDelete() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Delete Employee");
		mv.addObject("head", "Enter the Employee Id to Search Employee");
		mv.addObject("url", "findAndDelete");
		mv.addObject("submit", "Find And Delete Employee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/findAndDelete")
	public ModelAndView showEmployeeToDelete(int id) {
		Employee e = dao.findEmployee(id);
		ModelAndView mv = new ModelAndView();
		if(e==null) {
			mv.addObject("msg","No such Employee Found. Try Again...");
			mv.setViewName("UserMenu");
		}
		else {
			mv.addObject("emp", e);
			mv.setViewName("DeleteEmployee");
		}
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(Employee emp) {
		String msg = dao.deleteEmployee(emp);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("UserMenu");
		return mv;
	}
	@RequestMapping("/searchEmployee")
	public ModelAndView findToDisplay() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Search Employee");
		mv.addObject("head", "Enter the Employee Id to Search Employee");
		mv.addObject("url", "findAndDisplay");
		mv.addObject("submit", "Search Employee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/findAndDisplay") 
	public ModelAndView displayEmployee(int id) {
		Employee e = dao.findEmployee(id);
		ModelAndView mv = new ModelAndView();
		if(e==null) {
			mv.addObject("msg", "No such Employee Found. Please Try Again...");
			mv.setViewName("UserMenu");
		}
		else {
			mv.addObject("emp", e);
			mv.setViewName("DisplayEmployee");
		}
		return mv;
	}
	@RequestMapping("/updateEmployee")
	public ModelAndView findToUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Update Employee");
		mv.addObject("head", "Enter the Employee Id to Search Employee");
		mv.addObject("url", "findAndUpdate");
		mv.addObject("submit", "Update Employee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/findAndUpdate")
	public ModelAndView showEmployeeToUpdate(int id) {
		Employee e = dao.findEmployee(id);
		ModelAndView mv = new ModelAndView();
		if(e==null) {
			mv.addObject("msg","No such Employee Found. Try Again...");
			mv.setViewName("UserMenu");
		}
		else {
			mv.addObject("emp", e);
			mv.setViewName("UpdateEmployee");
		}
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView updateEmployee(Employee emp) {
		String msg = dao.updateEmployee(emp);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("UserMenu");
		return mv;
	}
	@RequestMapping("/displayAllEmployees")
	public ModelAndView displayAllEmployees() {
		List<Employee> empList = dao.getAllEmployees();
		ModelAndView mv = new ModelAndView();
		if(empList.size()==0) {
			mv.addObject("msg", "No Employee Details found in the Database..");
			mv.setViewName("UserMenu");
		}
		else {
			mv.addObject("empList", empList);
			mv.setViewName("ShowEmployees");
		}
		return mv;
	}
}
