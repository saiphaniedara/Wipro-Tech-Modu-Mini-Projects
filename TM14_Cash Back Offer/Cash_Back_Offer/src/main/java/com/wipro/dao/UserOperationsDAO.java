package com.wipro.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Coupon;
import com.wipro.bean.UserLogin;

@Repository
@Transactional
public class UserOperationsDAO {

	@Autowired
	SessionFactory sf;
	@Autowired
	HibernateTemplate ht;
	
	public int validateCredentials(String custId, String password) {
		int res;
		try {
			UserLogin ul = ht.load(UserLogin.class, custId);
				if(ul.getPassword().equals(password)) {
					res = 1;
				}
				else {
					res = 2;
				}
		}
		catch(Exception e) {
			res = 0;
		}
		return res;
	}

	public double getBalance(String custId) {
		return ht.load(UserLogin.class, custId).getBalance();
	}

	public boolean verifyCouponCode(String couponCode) {
		boolean valid = false;
		try {
			Coupon coup = ht.load(Coupon.class, couponCode);
			System.out.println(coup);
			if(coup != null)
				valid = true;
		}
		catch(Exception e) {
			valid = false;
		}
		return valid;
	}

	public int getPercentage(String couponCode) {
		int percentage = ht.load(Coupon.class, couponCode).getPercentage();
		return percentage;
	}

	public double updateBalance(String custId, int percentage) {
		UserLogin user = ht.load(UserLogin.class, custId);
		double updatedBalance;
		if(percentage != 0) {
			updatedBalance = user.getBalance()+(user.getBalance()/percentage);
		}
		else {
			updatedBalance = user.getBalance();
		}
		user.setBalance(updatedBalance);
		ht.saveOrUpdate(user);
		return updatedBalance;
	}

}
