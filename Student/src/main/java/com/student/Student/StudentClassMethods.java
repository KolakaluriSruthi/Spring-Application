package com.student.Student;

public class StudentClassMethods {
	 int id;
	   String sname;
	   String scourse;
	   String doj;
	   String batch;
	   public void insert(int Id,String Name,String Course,String DOJ,String Batch) {
		   id=Id;
		   sname=Name;
		   scourse=Course;
		   doj=DOJ;
		   batch=Batch;
	   }
	   public void print() {
		   System.out.println(id);
		   System.out.println(sname);
		   System.out.println(scourse);
		   System.out.println(doj);
		   System.out.println(batch);
	   }
}
