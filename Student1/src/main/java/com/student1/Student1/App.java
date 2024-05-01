package com.student1.Student1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Student s=new Student(101,"sruthi","python","11th batch","15-11-2023","banglore");
        System.out.println("Student rollno:"+s.getRollno());
        System.out.println("Student Name:"+s.getName());
        System.out.println("Student Course:"+s.getCourse());
        System.out.println("Student Batch:"+s.getBatch());
        System.out.println("Student DOJ:"+s.getDOJ());
        System.out.println("Student Location:"+s.getLocation());
        s.setRollno(101);
        s.setName("sravanthi");
        s.setCourse("java");
        s.setBatch("12th batch" );
        s.setDOJ("15-11-2023");
        s.setLocation("hyderabad");
        System.out.println("Student rollno:"+s.getRollno());
        System.out.println("Student Name:"+s.getName());
        System.out.println("Student Course:"+s.getCourse());
        System.out.println("Student Batch:"+s.getBatch());
        System.out.println("Student DOJ:"+s.getDOJ());
        System.out.println("Student Location:"+s.getLocation());*/
    	
    	Student s1= new Student(101,"keerthi",".net","12th batch","10-11-2023","ooty");
    	System.out.println("Student rollno:"+s1.getRollno());
        System.out.println("Student Name:"+s1.getName());
        System.out.println("Student Course:"+s1.getCourse());
        System.out.println("Student Batch:"+s1.getBatch());
        System.out.println("Student DOJ:"+s1.getDOJ());
        System.out.println("Student Location:"+s1.getLocation());
    	s1.setRollno(103);
        s1.setName("sravs");
        s1.setCourse("java fullstack");
        s1.setBatch("11th batch" );
        s1.setDOJ("15-12-2024");
        s1.setLocation("hyd");
    	System.out.println("Student rollno:"+s1.getRollno());
        System.out.println("Student Name:"+s1.getName());
        System.out.println("Student Course:"+s1.getCourse());
        System.out.println("Student Batch:"+s1.getBatch());
        System.out.println("Student DOJ:"+s1.getDOJ());
        System.out.println("Student Location:"+s1.getLocation());
    }
}
