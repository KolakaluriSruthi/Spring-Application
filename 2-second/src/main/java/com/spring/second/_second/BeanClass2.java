package com.spring.second._second;

public class BeanClass2 {
	private int num1;
    private int num2;
    
    public void setNum1(int num1) {
    	this.num1=num1;
    }
    public void setNum2(int num2) {
    	this.num2=num2;
    }
    public int getNum1() {
    	return this.num1;
    }
    public int getNum2() {
    	return this.num2;
    }
public BeanClass2() {
    	   super();
    }
    public BeanClass2(int num1,int num2) {
    	super();
    	this.num1=num1;
    	this.num2=num2;
    }
    public void printMultiply() {
    	int mul= num1*num2;
    	System.out.println("multiplication:"+mul);
    
    }
}
