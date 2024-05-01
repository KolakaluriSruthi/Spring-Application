package com.spring.twelve;

public class Employee {
     private int id;
     private String name;
     private Address address;
     public Employee() {
    	 
     }
     public Employee(int id,String name,Address address) {
    	 this.id=id;
    	 this.name=name;
    	 this.address=address;
     }
     public void setId(int id) {
    	 this.id=id;
     }
     public void setName(String name) {
    	 this.name=name;
    	 
     }
     public void setAddress(Address address){
    	 this.address=address;
    	 }
     public int getId() {
    	 return this.id;
     }
     public String getName() {
    	 return this.name;
     }
     public Address getAddress() {
    	 return this.address;
     }
     public void print() {
    	 System.out.println("Employee Details");
    	 System.out.println("EmployeeId:"+id);
    	 System.out.println("EmployeeName:"+name);
    	 System.out.println("EmployeeCity:"+address.getCity());
    	 System.out.println("EmployeeColony:"+address.getColony());
    	 System.out.println("EmployeeState:"+address.getState());
    	 System.out.println("Employee PinCode:"+address.getPin());
     }
}
