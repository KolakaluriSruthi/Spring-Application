package com.student.Student;

public class StudentSetter {
	int id;
	   String sname;
	   String scourse;
	   String doj;
	   String batch;
	   public void setId(int id) {
		   this.id=id;
	   }
	   public int getId() {
		   return id;
	   }
	   public void setName(String sname) {
		   this.sname=sname;
	   }
	   public String getName() {
		   return sname;
	   }
	   public void setCourse(String scourse) {
		   this.scourse=scourse;
	   }
	   public String getCourse() {
		   return scourse;
	   }
	   public void setDOJ(String doj) {
		   this.doj=doj;
	   }
	   public String getDOJ() {
		   return doj;
	   }
	   public void setBatch(String batch) {
		   this.batch=batch;
	   }
	   public String getBatch() {
		   return batch;
	   }
}
