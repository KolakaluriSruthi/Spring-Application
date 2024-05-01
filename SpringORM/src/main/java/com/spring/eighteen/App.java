package com.spring.eighteen;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.eighteen.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        StudentDao std=(StudentDao) context.getBean("stDao");
        StudentBean stdBean=new StudentBean();
        stdBean.setId(101);
        stdBean.setName("sri");
        stdBean.setCourse("JavaFullStack");
       // std.saveStudent(stdBean);
      // StudentBean i=  std.viewStudentOne(101);//
       //System.out.println(i);//
        //std.deleteStudent(101);
        //System.out.println("deleted");
        
       // List<StudentBean>st=std.studentAll();
        //System.out.println(st);
        
       StudentBean stdone=std.viewStudentOne(101);
      // stdone.setId(102);
       stdone.setName("vineeth ");
       stdone.setCourse("python ");
       std.updateStudent(stdone);
       System.out.println("Updated Successfully");
       
    }
}
