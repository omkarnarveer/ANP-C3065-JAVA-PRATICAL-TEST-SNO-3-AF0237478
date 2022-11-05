package com.mystore.dao;

import com.mystore.model.Product;
public class ProductDAO 
{
	Product prodArr[]=new Product[3];

	public void addProduct(Product product) {

		for(int i=0;i<prodArr.length;i++) {
			if(prodArr[i]==null) {
				prodArr[i]=product;
				break;
			}
		}
	} 

	Product prodArr2[]=new Product[3];
	int j=0;

	public Product[] getProductByNameStartWith(String n) {
		
		for(int i=0;i<prodArr.length;i++) {
			if(prodArr[i].getProductName().startsWith(n)) {
				prodArr2[j]=prodArr[i];
				j++;
			}
		}
		return prodArr2;
	}

	public Product[] getAllProducts() {
		return prodArr;
	}	
}

