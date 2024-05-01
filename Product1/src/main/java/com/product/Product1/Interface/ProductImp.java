package com.product.Product1.Interface;

public class ProductImp implements ProductInterface {
	 int productId;
	  String pName;
	  int pPrice;
	  int pQuantity;
	@Override
	public void setId(int productId) {
		// TODO Auto-generated method stub
		this.productId=productId;

	}

	@Override
	public void setName(String pName) {
		// TODO Auto-generated method stub
		this.pName=pName;

	}

	@Override
	public void setPrice(int pPrice) {
		// TODO Auto-generated method stub
		this.pPrice=pPrice;

	}

	@Override
	public void setQuantity(int pQuantity) {
		// TODO Auto-generated method stub
		this.pQuantity=pQuantity;

	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.productId;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.pName;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.pPrice;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return this.pQuantity;
	}

}
