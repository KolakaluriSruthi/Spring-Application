package com.spring.six2.AddressDIobjects1;

public class AddressBean1 {
	private String houseNum;
	private String city;
	private String state;
	private int pincode;

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public AddressBean1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressBean1(String houseNum, String city, String state, int pincode) {
		super();
		this.houseNum = houseNum;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}
