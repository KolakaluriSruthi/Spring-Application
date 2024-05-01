package com.spring.nineteen;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.nineteen.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
       EmployeeDao empDao=(EmployeeDao)context.getBean("empDao");
       EmployeeBean empBean=new EmployeeBean();
       empBean.setEmpId(103); 
       empBean.setEmpName("sruthi");
       empBean.setEmpSalary(35000);
      // empDao.saveEmployee(empBean);
       
       //EmployeeBean i=  empDao.viewEmployeeOne(101);//
       //System.out.println(i);
       
      // EmployeeBean empone=empDao.viewEmployeeOne(103);
       // empone.setId(102);
       // empone.setEmpName("meghana ");
        //empone.setEmpSalary(40000);
       // empDao.updateEmployee(empone);
       // System.out.println("Updated Successfully");
       
       //List<EmployeeBean>em=empDao.EmployeeAll();
       //System.out.println(em);
       
       empDao.deleteEmployee(101);
       System.out.println("deleted");  
    }
}
