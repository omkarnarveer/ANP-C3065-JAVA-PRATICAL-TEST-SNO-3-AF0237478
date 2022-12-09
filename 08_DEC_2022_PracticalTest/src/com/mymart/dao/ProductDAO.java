package com.mymart.dao;
import com.mymart.model.*;
import java.util.LinkedList;

public class ProductDAO {
	
	private static LinkedList<Product> products= new LinkedList<Product>();
	
	public void addProduct(Product product) {
		
		products.add(product);
	}
	
	public LinkedList<Product> getAllProducts() {
		
		 return products;	
	}
	 
	public static LinkedList<Product> searchByProductNameStartWithLetter(String letter) {
		 
		LinkedList<Product> result = new LinkedList<Product>();
			
			for (Product product : products) {
				
				if (product.getProdcutName().startsWith(letter)) {
					
					result.add(product);
				}
			}		
	return result;
	}
	
	public Product searchProductByID(int productID) {

		for (Product product : products) {
            if (product.getProductID() == productID) {
                return product;
            }     
		}
	return null;
	}
	
	public void deleteProductByID(int productID) {
		
		 LinkedList<Product> result = new LinkedList<Product>();
		 
		for(Product product : products){
			
            if(product.getProductID() == productID){
                result.remove(product);
                break;
            }
        }
	}
}
