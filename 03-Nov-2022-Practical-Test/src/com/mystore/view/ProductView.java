package com.mystore.view;

import java.util.Scanner;
import com.mystore.model.Product;
import com.mystore.service.ProductService;

public class ProductView{

	public static void main(String[] args) {

		ProductService prodService=new ProductService();

		Scanner sc=new Scanner(System.in);

		for(int i=0;i<3;i++) {
			
			System.out.println("Enter Product Id:");
			int iD=sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Product Name:");
			String name=sc.next();

			System.out.println("Enter Product Price:");
			double price=sc.nextDouble();
			sc.nextLine();

			Product prodClassObj=new Product(iD,name,price); 

			prodService.addProductService(prodClassObj);       
		}

		System.out.println("Enter First Letter:");
		String letter=sc.next();

		Product prodArr5[]=prodService.getProductByNameStartWithService(letter);

		for(int j=0;j<3;j++) {
			
			if(prodArr5[j]!=null) {
			
			System.out.println(prodArr5[j].getProductId());
			System.out.println(prodArr5[j].getProductName());
			System.out.println(prodArr5[j].getProductPrice());
			}
		}
			prodService.getAllProducts();		
	}		
}



