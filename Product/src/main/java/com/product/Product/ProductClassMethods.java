package com.product.Product;

public class ProductClassMethods {
	 int Id;
	    String Pname;
	    int Quantity;
	    double Price;
	    public void insert(int id,String name,int quantity,double price) {
	    	Id=id;
	    	Pname=name;
	    	Quantity=quantity;
	    	Price=price;
	    }
	    public void print() {
	    	 System.out.println(Id);
	    	 System.out.println(Pname);
	    	 System.out.println(Quantity);
	    	 System.out.println(Price);
	    }
}
