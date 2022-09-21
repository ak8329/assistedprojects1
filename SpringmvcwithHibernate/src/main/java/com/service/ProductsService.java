package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.products;
import com.dao.ProductDao;

@Service
public class ProductsService {
	@Autowired
	ProductDao pd;
	public String storeproduct(products ps)
	{
		if(ps.getPrice()<10000)
		return "product>10000";
	else if(pd.storeproduct(ps)>0)
	    return "products stored";
	else 
       return "try another product";
}

	public String updateProduct(products ps) {
		if(pd.updateProduct(ps)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	public String deleteproduct(int pid)
	{
	 if(pd.deleteproduct(pid)>0)
	    return "products delted ";
	else 
       return "try  with another product to delte";

}
	public String searchProductById(int pid) {
		products p = pd.searchProductById(pid);
		if(p==null) {
			return "Record not present";
		}
		else {
			return p.toString();
		}
	}
	
	public List<products> getAllProduct(){
		return pd.getAllProduct();
	}
		
	}

