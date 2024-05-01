package com.student.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //classmethods//
    	//StudentClassMethods scm=new StudentClassMethods();
    	//scm.insert(102, "chandu","python","15-11-2023","12th batch");
    	//scm.print();
    	
    	//StudentConstructor sc=new StudentConstructor(102,"pandu",".net","15-11-2023","12th batch");
    	//sc.print();
    	
    	StudentSetter ss=new StudentSetter();
    	ss.setId(101);
    	System.out.println(ss.getId());
    	ss.setName("keerthi");
    	ss.setCourse("java");
    	ss.setDOJ("12);
    }
}
