package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.UserDetails;
import com.wipro.dao.UserDAO;


@Controller
public class LoginController {
	
	@Autowired
	UserDAO dao;
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String gotoHome() {
		return "Home";
	}
	@RequestMapping("/Register")
	public String getRegPage() {
		return "RegistrationPage";
	}
	@RequestMapping("/RegisterUser")
	public ModelAndView registerUser(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd,@RequestParam("empno") String empId,@RequestParam("email") String email) {
		UserDetails ud = new UserDetails(empId, uname, pwd, email);
		System.out.println(ud);
		String res = dao.saveUser(ud);
		ModelAndView mv = new ModelAndView();
		mv.addObject("response", res);
		mv.setViewName("RegistrationResponse");
		return mv;
	}
	@RequestMapping("/Login")
	public String getLoginPage() {
		return "LoginPage";
	}
	@RequestMapping(path="/VerifyLogin", method=RequestMethod.POST)
	public ModelAndView verifyLogin(@RequestParam String uname, @RequestParam String pwd) {
		ModelAndView mv = new ModelAndView();
		if(uname=="" || pwd=="") {
			mv.addObject("msg", "There was no username/password provided");
			mv.setViewName("ResponsePage");
		}
		else {
		int res = dao.isuserValid(uname, pwd);
		if(res == 0) {
			mv.addObject("msg", "There is no such user in the system");
			mv.setViewName("ResponsePage");
		}
		else {
			if(res == 2) {
				mv.addObject("msg", "There combination of username/password is wrong");
				mv.setViewName("ResponsePage");
			}
			else {
				mv.addObject("msg", "Login Successful....");
				mv.setViewName("UserMenu");
			}
		}
		}
		return mv;
	}
	@RequestMapping(method =RequestMethod.GET, path={"/Welcome","/VerifyLogin"})
	public String gotoLoginPage() {
		return "LoginPage";
	}
}
