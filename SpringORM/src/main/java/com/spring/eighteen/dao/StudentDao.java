package com.spring.eighteen.dao;

import java.util.List;

import com.spring.eighteen.StudentBean;

public interface StudentDao {
        public int saveStudent(StudentBean studentBean);
        public StudentBean viewStudentOne(int id);
        public void updateStudent(StudentBean studentBean);
        public void deleteStudent(int id);
        public List<StudentBean>studentAll();
}
