package com.spring.eighteen.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.eighteen.StudentBean;

public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public int saveStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		int savedetaile=(Integer)hibernateTemplate.save(studentBean);
		return savedetaile;
	}
	@Transactional
	@Override
	public StudentBean viewStudentOne(int id) {
		// TODO Auto-generated method stub
		StudentBean std=hibernateTemplate.get(StudentBean.class,id);
		
		return std;
	}
@Transactional
	@Override
	public void updateStudent(StudentBean studentBean) {
		hibernateTemplate.update(studentBean);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		StudentBean std1=hibernateTemplate.get(StudentBean.class,id);
		if(std1!=null) {
			hibernateTemplate.delete(std1);
	        }
	}
@Transactional
	@Override
	public List<StudentBean> studentAll() {
		// TODO Auto-generated method stub
		List<StudentBean>st=hibernateTemplate.loadAll(StudentBean.class);
		return st;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
	}
	public HibernateTemplate getHibernetTemplate() {
		return this.hibernateTemplate;
	}
	public StudentDaoImpl() {
		super();
	}
	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate=hibernateTemplate;
	}
	
      
}
