package com.student.Student;


public class Student {
   int id;
   String sname;
   String scourse;
   String doj;
   String batch;
   public static void main(String[]args) {
	   Student s=new Student();
	   int Id=s.id=103;  
	   String Name=s.sname="keerthi";
	   String Course=s.scourse="java";
	   String DOJ=s.doj="14-11-2023";
	   String Batch=s.batch="12th batch";
	   System.out.println(Id);
	   System.out.println(Name);
	   System.out.println(Course);
	   System.out.println(DOJ);
	   System.out.println(Batch);
	   
   }
}
