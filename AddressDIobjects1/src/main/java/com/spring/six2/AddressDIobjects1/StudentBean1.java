package com.spring.six2.AddressDIobjects1;


import java.util.*;
public class StudentBean1 {
	private int studentId;
	  private String studentName;
	  private AddressBean1 address;
	  public StudentBean1() {
		  super();
	  }
	  public StudentBean1(int studentId,String studentName,AddressBean1 address) {
		  super();
		  this.studentId=studentId;
		  this.studentName=studentName;
		  this.address=address;
	  }
	  public void setStudentId(int studentId) {
		  this.studentId=studentId;
	  }
	  public void setStudentName(String studentName) {
		  this.studentName=studentName;
	  }
	  public void setAddressBean(AddressBean1 address) {
		  this.address=address;
	  }
	  public int getStudentId() {
		  return this.studentId;
	  }
	  public String geytStudentName() {
		  return this.studentName;
	  }
	  public AddressBean1 getAddress() {
		  return this.address;
	  }
	  public void print() {
		  System.out.println("StudentId:"+studentId);
		  System.out.println("StudentName:"+studentName);
		  System.out.println("HouseNum:"+address.getHouseNum());
		  System.out.println("City:"+address.getCity());
		  System.out.println("State:"+address.getState());
		  System.out.println("Pincode:"+address.getPincode());
		  
	  }
}
