package com.mystore.model;

public class Product {
	// Member Variable
	int productId;
	String productName;
	double productPrice;

	public Product() // Constructor Without Parameter
	{

	}

	public Product(int pId, String pName, double pprice) //Constructor  With Parameter
	{
		productId = pId;
		productName = pName;
		productPrice = pprice;
	}

	public Product(int pId){
		productId = pId;
	}

	public Product(String pName){
		productName = pName;
	}

	public Product(double pprice) {
		productPrice = pprice;
	}

	public void setProductId(int pId) { 
		productId = pId;
	}

	public int getProductId() {
		return productId;
	}

	public void Product(String pName) {
		productName = pName;
	}

	public void setProductName(String pName) {
		productName = pName;

	}

	public String getProductName(){
		return productName;
	}

	public void setProductPrice(double pPrice){
		productPrice = pPrice;
	}

	public double getProductPrice() {
		return productPrice;
	}

}