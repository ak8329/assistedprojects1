package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService ls;
	@RequestMapping(value="signin",method=RequestMethod.POST)
	public ModelAndView signin(HttpServletRequest req,Login l)
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String r=ls.signin(l);
		ModelAndView mv=new ModelAndView();
		if(r.equals("success"))
		{
			mv.setViewName("sdb.jsp");
		}
		else 
		{
			mv.setViewName("fdb.jsp");
	}
		
	return mv;	
	}
	@RequestMapping(value="signup",method=RequestMethod.POST)
	public ModelAndView signup(HttpServletRequest req,Login l)
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String r=ls.signup(l);
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",r);
		mv.setViewName("Logindb.jsp");
		
		
		
	return mv;	
	}
}
//	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
//	public ModelAndView checkUserDetails(HttpServletRequest req) {			// DI for HttpServletRequest 
//			
//			String email = req.getParameter("email");
//			String password = req.getParameter("password");
//			
//			ModelAndView mav = new ModelAndView();
//			
//			if(email.equals("raj@gmail.com") && password.equals("123")) {
//				mav.setViewName("s.jsp");
//			}else {
//				mav.setViewName("f.jsp");
//			}
//			
//			return mav;
//	}
//}

