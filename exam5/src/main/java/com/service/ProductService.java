package com.service;
import java.util.Iterator;
import java.util.List;


import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {	
		
 			if(pd.storeProduct(product)>0) {

			return "Product stored successfully";
			
		}else {
			return "Product didn't store id must be unique";
		}
	}
 			
}



