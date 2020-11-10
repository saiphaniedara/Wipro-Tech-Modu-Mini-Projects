package com.wipro.dao;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Employee;

@Repository
@Transactional
public class EmployeeDAO {
	@Autowired
	private SessionFactory sf;
	@Autowired
	private HibernateTemplate ht;
	
	public String addEmployee(Employee emp) {
		String msg;
		try {
			ht.save(emp);
			msg = "Employee Details inserted Successfully";
		}
		catch(Exception e) {
			msg = "Employee Details could not be inserted. Please Try Again...";
		}
		return msg;
	}
	public Employee findEmployee(int id) {
		return ht.get(Employee.class, id);
	}
	public String deleteEmployee(Employee emp) {
		String msg;
		try {
			ht.delete(emp);
			msg = "Employee Deleted Successfully";
		}
		catch(Exception e) {
			msg="Employee Could not be Deleted";
		}
		return msg;
	}
	public String updateEmployee(Employee emp) {
		String msg;
		try {
			ht.saveOrUpdate(emp);
			msg = "Employee Details Updated Successfully";
		}
		catch(Exception e) {
			msg = "Employee Details could not be updated. Please Try Again...";
		}
		return msg;
	}
	public List<Employee> getAllEmployees() {
		Session s = sf.getCurrentSession();
		Query<Employee> q = s.createQuery("from Employee", Employee.class);
		List<Employee> eList = q.getResultList();
		return eList;
	}
	public int generateId() {
		List<Employee> li = getAllEmployees();
		int id;
		if(li.size()==0) {
			id = 101;
		}
		else {
			id = li.get(li.size()-1).getId()+1;
		}
		return id;
	}
}
