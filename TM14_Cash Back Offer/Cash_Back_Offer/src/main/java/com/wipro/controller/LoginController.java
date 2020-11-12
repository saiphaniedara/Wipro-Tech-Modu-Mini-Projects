package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.dao.UserOperationsDAO;

@Controller
public class LoginController {
	
	@Autowired
	UserOperationsDAO dao;
	
	@RequestMapping("/")
	public String getLoginPage() {
		return "LoginPage";
	}
	@RequestMapping("/verifyLogin")
	public ModelAndView verifyLogin(String custId, String password) {
		ModelAndView mv = new ModelAndView();
		int resp = dao.validateCredentials(custId, password);
		if(resp == 1) {
			double balance = dao.getBalance(custId);
			mv.addObject("custId", custId);
			mv.addObject("balance", balance);
			mv.setViewName("UserHome");
		}
		else {
			if(resp == 0) {
				mv.addObject("message", "Invalid Customer ID Entered...");
			}
			else {
				mv.addObject("message", "Incorrect Password Entered...");
			}
			mv.setViewName("LoginPage");
		}
		return mv;
	}
	@RequestMapping("/checkCoupon")
	public ModelAndView checkCoupon(String custId, String couponCode) {
		ModelAndView mv = new ModelAndView();
		boolean valid = dao.verifyCouponCode(couponCode);
		if(valid) {
			int percentage = dao.getPercentage(couponCode);
			double balance = dao.updateBalance(custId, percentage);
			mv.addObject("percentage", percentage);
			mv.addObject("balance", balance);
			mv.setViewName("CouponSuccess");
		}
		else {
			mv.setViewName("CouponFailed");
		}
		return mv;
	}
}
