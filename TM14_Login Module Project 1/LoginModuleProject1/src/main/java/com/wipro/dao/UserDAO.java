package com.wipro.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.UserDetails;

@Repository
@org.springframework.transaction.annotation.Transactional
public class UserDAO {
	@Autowired
	SessionFactory sf;
	@Autowired
	HibernateTemplate ht;
	public String saveUser(UserDetails ud) {
		String msg="";
		try {
			ht.save(ud);
			msg="User Registered Successfully";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg="User Registration Failed. Please Try Again....";
		}
		return msg;
	}
	public int isuserValid(String uname, String pwd) {
		int out;
		UserDetails ud = ht.get(UserDetails.class, uname);
		if(ud==null) {
			out = 0;
		}
		else {
			if(ud.getPassword().equals(pwd)) {
				out = 1;
			}
			else {
				out=2;
			}
		}
		return out;
		
	}
}
