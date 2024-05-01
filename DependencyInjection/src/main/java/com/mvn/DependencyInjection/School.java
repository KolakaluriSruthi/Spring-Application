package com.mvn.DependencyInjection;

public class School {
   private String schoolName;
   private Student student;
   /* School(Student stu) {
	   student=stu;
   }
   public  School(String schoolName,Student student) {
	   this.schoolName=schoolName;
	   this.student=student;
   }*/
   public void setSchoolName(String schoolName) {
	   this.schoolName=schoolName;
   }
   public void setStudent(Student student) {
	   this.student=student;
   }
   public String getSchoolName() {
	   return this.schoolName;
   }
   public Student getStudent() {
	   return this.student=student;
   }
   void print() {
	   System.out.println(schoolName);
	   System.out.println(student.getStudentName());
	   System.out.println(student.getSclass());
	   System.out.println(student.getMarks().getTelugu());
	   System.out.println(student.getMarks().getMaths());
	   System.out.println(student.getMarks().getEnglish());
	   System.out.println(student.getMarks().getScience());
   }
}
