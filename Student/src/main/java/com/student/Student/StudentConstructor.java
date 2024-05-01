package com.student.Student;

public class StudentConstructor {
	int id;
	   String sname;
	   String scourse;
	   String doj;
	   String batch;
	   public StudentConstructor(int Id,String Name,String Course,String DOJ,String Batch){
		   this.id=Id;
		   this.sname=Name;
		   this.scourse=Course;
		   this.doj=DOJ;
		   this.batch=Batch;
	   }
	   public void print() {
		   System.out.println("studentId:"+id);
		   System.out.println("studentName:"+sname);
		   System.out.println("studentCourse:"+scourse);
		   System.out.println("student Date od join:"+doj);
		   System.out.println("student Batch:"+batch);
	   }
}
