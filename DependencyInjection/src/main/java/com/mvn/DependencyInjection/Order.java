package com.mvn.DependencyInjection;

public class Order {
    private int orderId;
    private String name;
    private Product product;
   /* Order(Product prod){
    	product=prod;
    }
    public Order(int orderId,String name,Product product) {
    	this.orderId=orderId;
    	this.name=name;
    	this.product=product;
    }*/
    public void setOrderId(int orderId) {
    	this.orderId=orderId;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public void setProduct(Product product) {
    	this.product=product;
    }
    public int getOrderId() {
    	return this.orderId;
    }
    public String getName() {
    	return this.getName();
    }
    public Product getProduct() {
    	return this.product;
    }
    void print() {
    	System.out.println(orderId);
    	System.out.println(name);
    	 System.out.println(product.getProductId()) ;
         System.out.println(product.getPname());
         System.out.println(product.getPrice());
         System.out.println(product.getQuantity());
    }
}