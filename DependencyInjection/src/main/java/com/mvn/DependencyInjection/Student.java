package com.mvn.DependencyInjection;

public class Student {
   private String studentName;
   private  int sclass;
   private  Marks marks;
  /* Student(Marks mar){
	   marks=mar;
   }
public Student(String studentName,int sclass,Marks marks) {
	this.studentName=studentName;
	this.sclass=sclass;
	this.marks=marks;
}*/
public void setStudentName(String studentName) {
	this.studentName=studentName;
}
public void setSclass(int sclass) {
	this.sclass=sclass;
}
public void setMarks(Marks marks) {
	this.marks=marks;
}
public String getStudentName() {
	return this.studentName;
}
public int getSclass() {
	return this.sclass;
}
public Marks getMarks() {
	return this.marks;
}
}
