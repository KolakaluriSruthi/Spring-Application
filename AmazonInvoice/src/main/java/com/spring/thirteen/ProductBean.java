package com.spring.thirteen;

public class ProductBean {
     private int pId;
     private String pname;
     private int quantity;
     private double price;
     public ProductBean() {
    	 
     }
     public ProductBean(int pId,String pname,int quantity,double price) {
    	 this.pId=pId;
    	 this.pname=pname;
    	 this.quantity=quantity;
    	 this.price=price;
     }
     public void setProductId(int pId) {
    	 this.pId=pId;
     }
     public void setProductName(String pname) {
    	 this.pname=pname;
     }
     public void setQuantity(int quantity) {
    	 this.quantity=quantity;
     }
     public void setPrice(double price) {
    	 this.price=price;
     }
     public int getProductId() {
    	 return this.pId;
     }
     public String getProductName() {
    	 return this.pname;
     }
     public int getQuantity() {
    	 return this.quantity;
     }
     public double getPrice() {
    	 return this.price;
     }
     public void printProduct() {
    	 double total=price*quantity;
    	 System.out.println("total::"+total);
    	 double discount=0.0;
    	 if(total<3000) {
    		 discount=(total*10)/100;
    	 }
    	 else if(total>=3000&&total<10000) {
    		 discount=(total*15)/100;
    	 }
    	 else {
    		 discount=(total*20)/100;
    		 System.out.println("Discount:"+discount);
    		 double invoice=total-discount;
    		 System.out.println("invoice:"+invoice);
    	 }
     }
}
