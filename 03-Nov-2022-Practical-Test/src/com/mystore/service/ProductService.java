package com.mystore.service;
import com.mystore.dao.*;
import com.mystore.model.*;

public class ProductService {
	
	ProductDAO prodDAO=new ProductDAO();

	public void addProductService(Product product) {
		prodDAO.addProduct(product);
	}

	public Product[] getProductByNameStartWithService(String s) {
		Product[] prodArr3=prodDAO.getProductByNameStartWith(s);   
	return prodArr3;
	}

	public Product[] getAllProducts() {
		Product prodArr4[]=prodDAO.getAllProducts(); 
	return prodArr4;
	}

}

