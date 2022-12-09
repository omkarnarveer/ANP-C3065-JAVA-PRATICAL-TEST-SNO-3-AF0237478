package com.mymart.model;

public class Product {
	
	private int productID;
	private String productName;
	private float productPrice;
	
	public Product(int id,String name,float price){
		
		this.productID =id;
		this.productName = name;
		this.productPrice=price;
		
	}
    public void setProudctName(String productName) {
    	
        this.productName = productName;
    }
    
    public void setProductID(int productID) {
    	
        this.productID = productID;
    }
    public void setProdcutPrice(float productPrice) {
    	
        this.productPrice = productPrice;
    }
 
    public String getProdcutName() {
    	 return productName;
    }
    
    public int getProductID() {
    	 return productID;  
    }
    public float getProductPrice() {
        return productPrice;
    }
    
    @Override
    public String toString() {
        return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
		return true;
   
    }
    @Override
    public int hashCode() {
        int result = 10;
        result = 20 * result + productID;
        result = 20 * result + productName.hashCode();
        return result;
    }
}


