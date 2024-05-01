package com.spring.twelve;

public class Address {
     private String city;
     private String colony;
     private String state;
     private int pin;
     public Address() {
    	 
     }
     public Address(String city,String colony,String state,int pin) {
    	 this.city=city;
    	 this.colony=colony;
    	 this.state=state;
    	 this.pin=pin;
     }
     public void setCity(String city) {
    	 this.city=city;
     }
     public void setColony(String colony) {
    	 this.colony=colony;
     }
     public void setState(String state) {
    	 this.state=state;
     }
     public void setPin(int pin) {
    	 this.pin=pin;
     }
     public String getCity() {
    	 return this.city;
     }
     public String getColony() {
    	 return this.colony;
     }
     public String getState() {
    	 return this.state;
     }
     public int getPin() {
    	 return this.pin;
     }
     
}
