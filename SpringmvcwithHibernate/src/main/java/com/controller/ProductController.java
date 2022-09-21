package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.products;
import com.service.ProductsService;

@Controller
public class ProductController<product> {
	@Autowired
	ProductsService pps;
	
	@RequestMapping(value = "storeproduct",method = RequestMethod.POST)
	public ModelAndView storeproduct(HttpServletRequest req, products ps) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		String ulr = req.getParameter("url");
		
		ps.setPid(pid);
		ps.setPname(pname);
		ps.setPrice(price);
		ps.setUrl(ulr);
		
		String r =pps.storeproduct(ps);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", r);
		mav.setViewName("store.jsp");
		return mav;
	}
	@RequestMapping(value = "deleteproduct",method = RequestMethod.POST)
	public ModelAndView deleteproduct(HttpServletRequest req) {
		int pid = Integer.parseInt(req.getParameter("pid"));
	
		String r =pps.deleteproduct(pid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", r);
		mav.setViewName("delete.jsp");
		return mav;
}

	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, products product) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		float price = Float.parseFloat(req.getParameter("price"));
		String ulr = req.getParameter("url");
		
		product.setPid(pid);
		product.setPrice(price);
		product.setUrl(ulr);
		
		String result = pps.updateProduct(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("update.jsp");
		return mav;
	}
	@RequestMapping(value = "searchProduct",method = RequestMethod.POST)
	public ModelAndView searchProduct(HttpServletRequest req) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		
		String r = pps.searchProductById(pid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", r);
		mav.setViewName("retrive.jsp");
		return mav;
	}


	@RequestMapping(value = "findProduct",method = RequestMethod.GET)
	public ModelAndView findAllProduct() {
		List<products> listOfProduct = pps.getAllProduct();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfProduct", listOfProduct);				// requestScope.setAttribute 
		mav.setViewName("veiwallproducts.jsp");
		return mav;
	}
	
}
