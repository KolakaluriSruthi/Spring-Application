package com.product.Product1;

public class Product {
  int productId;
  String pName;
  int pPrice;
  int pQuantity;
  public Product() {
	 
  }
  public Product(int productId,String pName,int pPrice,int pQuantity) {
  this.productId=productId;
  this.pName=pName;
  this.pPrice=pPrice;
  this.pQuantity=pQuantity;
  }
  public void setId(int productId) {
	  this.productId=productId;
  }
  public void setName(String pName) {
	  this.pName=pName;
  }
  public void setPrice(int pPrice ) {
	  this.pPrice=pPrice;
  }
  public void setQuantity(int pQuantity) {
	  this.pQuantity=pQuantity;
  }
  public int getId() {
	  return this.productId;
  }
  public String getName() {
	  return this.pName;
  }
  public int getPrice() {
	  return this.pPrice;
  }
  public int getQuantity() {
	  return this.pQuantity;
  }
}
