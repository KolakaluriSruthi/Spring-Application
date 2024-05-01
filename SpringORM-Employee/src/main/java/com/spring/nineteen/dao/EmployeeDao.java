package com.spring.nineteen.dao;

import java.util.List;


import com.spring.nineteen.EmployeeBean;

public interface EmployeeDao {
	public int saveEmployee(EmployeeBean employeeBean);
    public EmployeeBean viewEmployeeOne(int id);
    public void updateEmployee(EmployeeBean employeeBean);
    public void deleteEmployee(int id);
    public List<EmployeeBean>EmployeeAll();
}
