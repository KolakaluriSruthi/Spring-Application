package com.spring.five.DIFormObjects;

public class OrderBean {
	private int orderId;
	private ProductBean product;
     
	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderBean(int orderId, ProductBean product) {
		super();
		this.orderId = orderId;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ProductBean getProduct() {
		return product;
	}

	public void setProduct(ProductBean product) {
		this.product = product;
	}

	public void print() {
    	  System.out.println("OrderId:"+orderId);
    	  System.out.println("product Id:"+product.getProductId());
    	  System.out.println("product Name:"+product.getProductName());
    	  System.out.println("product Price:"+product.getProductQuantity());
    	  System.out.println("product Quantity:"+product.getProductPrice());
      }
}
