package com.product.Product;

public class ProductSetter {
	int Id;
    String Pname;
    int Quantity;
    double Price;
    public void setId(int Id) {
    	this.Id=Id;
    }
    public int getId() {
    	return Id;
    }
    public void setName(String Pname) {
    	this.Pname=Pname;
    }
    public String getName() {
    	return Pname;
    }
    public void setQuantity(int Quantity) {
    	this.Quantity=	Quantity;
    }
    public int getQuantity() {
    	return Quantity;
    }
    public void setPrice(double Price) {
    	this.Price=Price;
    }
    public double getPrice() {
    	return Price;
    }
}
