package com.mymart.service;
import com.mymart.dao.*;
public class ProductService {
	private ProductDAO productDAO;
	
	public ProductService(ProductDAO productDAO) {
	        this.productDAO = productDAO;
	    }
	
	public void addProductService(ProductDAO product){
        productDAO.addProduct(product);
    }
}
