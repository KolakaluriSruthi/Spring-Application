package com.product.Product;
//instance variables//
public class Product {
    int Id;
    String Pname;
    int Quantity;
    double Price;
    public static void main(String[]args) {
    	Product p=new Product();
    	int id=p.Id=101;
    	String name=p.Pname="Chair";
    	int quantity=p.Quantity=5;
    	double price=p.Price=2000;
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(quantity);
    	System.out.println(price);
    	
    }
}
