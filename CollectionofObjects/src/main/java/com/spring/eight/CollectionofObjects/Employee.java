package com.spring.eight.CollectionofObjects;

import java.util.*;
public class Employee {
        private List<String> empName;
        private Set<Integer> empNum;
        private Map<String,Integer> empDeptno;
        private Properties empSalary;
        public Employee() {
        	
        }
        public Employee(List<String> empName,Set<Integer> empNum,Map<String,Integer> empDeptno,Properties empSalary) {
        	this.empName=empName;
        	this.empNum=empNum;
        	this.empDeptno=empDeptno;
        	this.empSalary=empSalary;
        }
        public void setEmpName(List<String> empName) {
        	this.empName=empName;
        	
        }
        public void setEmpNum(Set<Integer> empNum) {
        	this.empNum=empNum;
        	
        }
        public void setEmpDeptno(Map<String,Integer> empDeptno) {
        	this.empDeptno=empDeptno;
        }
        public void setEmpSalary(Properties empSalary) {
        	this.empSalary=empSalary;
        }
        public List<String> getEmpName(){
        	return this.empName;
        }
        public Set<Integer> getEmpNum(){
        	return this.empNum;
        }
        public Map<String,Integer> getEmpDeptno(){
        	return this.empDeptno;
        }
        public Properties getEmpSalary() {
        	return this.empSalary=empSalary;
        }
        public void print() {
        	System.out.println("Employee Names");
        	for(String employeename:empName) {
       		 System.out.println(employeename);
        }
        	System.out.println("Employee Numbers");
        	for(Integer employeenumbers:empNum) {
        		System.out.println(employeenumbers);
        	}
        	System.out.println("Employee Department Numbers");
      	  for(Map.Entry<String,Integer>entry:empDeptno.entrySet()) {
      		  System.out.println(entry.getKey()+":"+entry.getValue());
      	  }
      	 Set<String>keys=empSalary.stringPropertyNames();
    	 for(String key:keys) {
    		 System.out.println(key+":"+empSalary.getProperty(key));
    	 }
}
        }
