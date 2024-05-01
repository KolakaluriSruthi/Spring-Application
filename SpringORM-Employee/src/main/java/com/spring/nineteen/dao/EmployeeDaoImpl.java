package com.spring.nineteen.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

 
import com.spring.nineteen.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDao {
  private HibernateTemplate hibernateTemplate;
@Transactional
@Override
public int saveEmployee(EmployeeBean employeeBean) {
	int savedetails=(Integer)hibernateTemplate.save(employeeBean);
	return savedetails;
	// TODO Auto-generated method stub
	
}
@Transactional
@Override
public EmployeeBean viewEmployeeOne(int id) {
	EmployeeBean emp=hibernateTemplate.get(EmployeeBean.class,id);
	
	return emp;
	// TODO Auto-generated method stub
	
}
@Transactional
@Override
public void updateEmployee(EmployeeBean employeeBean) {
	hibernateTemplate.update(employeeBean);
	// TODO Auto-generated method stub
	
}
@Transactional
@Override
public void deleteEmployee(int id) {
	EmployeeBean emp1=hibernateTemplate.get(EmployeeBean.class,id);
	if(emp1!=null) {
		hibernateTemplate.delete(emp1);
        }
	// TODO Auto-generated method stub
	
}
@Transactional
@Override
public List<EmployeeBean> EmployeeAll() {
	// TODO Auto-generated method stub
	List<EmployeeBean>em=hibernateTemplate.loadAll(EmployeeBean.class);
	return em;
	
}
 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	 this.hibernateTemplate=hibernateTemplate;
 }
 public HibernateTemplate getHibernateTemplate() {
	 return this.hibernateTemplate;
 }
 public EmployeeDaoImpl() {
	 super();
	 
 }
 public EmployeeDaoImpl(HibernateTemplate hibernateTemplate) {
	 super();
	 this.hibernateTemplate=hibernateTemplate;
 }
}
