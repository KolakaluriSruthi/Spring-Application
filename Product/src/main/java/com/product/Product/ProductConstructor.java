package com.product.Product;

public class ProductConstructor {
	int Id;
    String Pname;
    int Quantity;
    double Price;
    public ProductConstructor(int id,String name,int quantity,double price) {
    	this.Id=id;
    	this.Pname=name;
    	this.Quantity=quantity;
    	this.Price=price;
    }
    public void print() {
    	System.out.println("ProductId:"+Id);
    	System.out.println("ProductName:"+Pname);
    	System.out.println("ProductQuantity:"+Quantity);
    	System.out.println("ProductPrice:"+Price);
    }
}
