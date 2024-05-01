package com.mvn.DipendencyInjection;

public class Department {
   private int DeptId;
   private String DeptName;
   public Department(int DeptId,String DeptName) {
	   this.DeptId=DeptId;
	   this.DeptName=DeptName;
   }
   public void setDeptId(int DeptId) {
	   this.DeptId=DeptId;
   }
   public void setDeptName(String DeptName) {
	   this.DeptName=DeptName;
   }
   public int getDeptId() {
	   return this.DeptId;
   }
   public String getDeptName() {
	   return this.DeptName;
   }
}
