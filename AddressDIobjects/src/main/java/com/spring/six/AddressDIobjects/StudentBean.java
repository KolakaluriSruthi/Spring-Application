package com.spring.six.AddressDIobjects;

public class StudentBean {
  private int studentId;
  private String studentName;
  private AddressBean address;
  public StudentBean() {
	  super();
  }
  public StudentBean(int studentId,String studentName,AddressBean address) {
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
  public void setAddressBean(AddressBean address) {
	  this.address=address;
  }
  public int getStudentId() {
	  return this.studentId;
  }
  public String geytStudentName() {
	  return this.studentName;
  }
  public AddressBean getAddressBean() {
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
