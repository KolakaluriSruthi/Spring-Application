package com.mvn.DependencyInjection;

public class Product {
  private int productId;
  private String pname;
  private double price;
  private int quantity;
  public Product(int productId,String pname,double price,int quantity) {
	  
	  this.productId=productId;
	  this.pname=pname;
	  this.price=price;
	  this.quantity=quantity;
  }
  public Product() {
	  
  }
  public void setProductId(int productId) {
	  this.productId=productId;
  }
  public void setPname(String pname) {
	  this.pname=pname;
  }
  public void setPrice(double price) {
	  this.price=price;
  }
  public void setQuantity(int quantity) {
	  this.quantity=quantity;
  }
  public int getProductId() {
	  return this.productId;
  }
  public String getPname() {
	  return this.pname;
  }
  public double getPrice() {
	 return this.price;
  }
  public int getQuantity() {
	  return this.quantity;
  }
}
