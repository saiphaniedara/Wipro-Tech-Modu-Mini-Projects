package com.wipro.dao;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;

public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sf;
	
	public EmployeeDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		sf = cfg.buildSessionFactory();
	}
	public String addEmployee(Employee e) {
		String msg="";
		if(e!=null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(e);
			tx.commit();
			s.close();
			msg="Inserted Successfully";
		}
		else {
			msg="Not Inserted";
		}
		return msg;
	}
	public String deleteEmployee(Employee e) {
		String msg="";
		if(e!=null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.delete(e);
			tx.commit();
			s.close();
			msg="Deleted Successfully";
		}
		else {
			msg="Not Deleted";
		}
		return msg;
	}
	public String modifyEmployee(Employee e) {
		String msg="";
		if(e!=null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.saveOrUpdate(e);
			tx.commit();
			s.close();
			msg="Updated Successfully";
		}
		else {
			msg="Not Updated";
		}
		return msg;
	}
	public Employee selectEmployee(int id) {
		Session s = sf.openSession();
		Query q = s.createQuery("from Employee where id=?0");
		q.setParameter(0, id);
		Employee e = (Employee) q.getSingleResult();
		s.close();
		return e;
	}
	public List<Employee> selectAllEmployees() {
		Session s = sf.openSession();
		Query q = s.createQuery("from Employee");
		List<Employee> l = q.getResultList();
		return l;
	}
}
