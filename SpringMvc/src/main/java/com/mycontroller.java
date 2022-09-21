package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller {
	@RequestMapping(value="hello",method=RequestMethod.GET)
	 public ModelAndView yy()
	 {
		ModelAndView mv=new ModelAndView() ;
		System.out.println("good");
		mv.setViewName("display.jsp");
		return mv;
	 }
	

}
