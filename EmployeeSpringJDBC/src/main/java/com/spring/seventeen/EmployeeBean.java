package com.spring.seventeen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeBean {
    private int empId;
    private String empName;
    private double empSalary;
    private int deptNo;
    private JdbcTemplate jdbctemplate;
    public EmployeeBean() {
    	
    }
    public EmployeeBean(int empId,String empName,double empSalary,int deptNo,JdbcTemplate jdbctemplate) {
    	this.empId=empId;
    	this.empName=empName;
    	this.empSalary=empSalary;
    	this.deptNo=deptNo;
    	this.jdbctemplate=jdbctemplate;
    	
    }
    public void setId(int empId) {
    	this.empId=empId;
    }
    public void setName(String empName) {
    	this.empName=empName;
    	
    }
    public void setSalary(double empSalary) {
    	this.empSalary=empSalary;
    }
    public void setDeptNo(int deptNo) {
    	this.deptNo=deptNo;
    }
    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
    	this.jdbctemplate=jdbctemplate;
    }
    public int getId() {
    	return this.empId;
    }
    public String getName() {
    	return this.empName;
    }
    public double getSalary() {
    	return this.empSalary;
    }
    public int getDeptNo() {
    	return this.deptNo;
    }
    public JdbcTemplate getJdbctemplate() {
    	return this.jdbctemplate;
    }
    public void create() {
		 jdbctemplate.execute("create table Employee(id int,name varchar2(20), deptno int)");
		 System.out.println("Table Created");
	 }
    public void insert() {
		 int insert=jdbctemplate.update("insert into Employee values(101,'meghana',111)");
		 System.out.println(insert+"Employee inserted");
    }
    public void insert1() {
    	int insert=jdbctemplate.update("insert into Employee values(102,'anu',222)");
    	System.out.println(insert+"Employee inserted");
    }
	 
	 public void delete() {
		 int delete=jdbctemplate.update("delete from Employee where id=101");
		 System.out.println(delete+"Employee deleted");
	 }
	 public void updateRecord() {
		 int up=jdbctemplate.update("update Employee set name='srikar'where id='101'");
		 System.out.println(up+"Employee updated");
	 }
	 public void getoneRecord() {
		 List<Map <String, Object>>oneRecord=jdbctemplate.queryForList("select*from Employee where id='101' ");
		 Iterator it=oneRecord.iterator();
		 while(it.hasNext()) {
			 Object obj=it.next();
			 System.out.println(obj.toString());
		 }
	 }
		 public void getAll() {
			 List<Map <String, Object>>oneRecord=jdbctemplate.queryForList("select*from Employee");
			 Iterator it=oneRecord.iterator();
			 while(it.hasNext()) {
				 Object obj1=it.next();
				 System.out.println(obj1.toString());
			 }
}
}
