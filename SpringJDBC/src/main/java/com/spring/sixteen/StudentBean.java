package com.spring.sixteen;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentBean {
	private JdbcTemplate jdbctemplate;
	 public StudentBean() {
		 
	 }
	 public StudentBean(JdbcTemplate jdbctemplate) {
		 this.jdbctemplate=jdbctemplate;
	 }
	 public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		 this.jdbctemplate=jdbctemplate;
	 }
	 public JdbcTemplate getJdbctemplate() {
		 return this.jdbctemplate;
	 }
	 public void create() {
		 jdbctemplate.execute("create table Student(id int,name varchar2(20),course varchar2(20))  ");
		 System.out.println("Table Created");
	 }

	 /*public void insert() {
		 int insert=jdbctemplate.update("insert into Student values(101,'sri','javafullstack')");
		 System.out.println(insert+"student inserted");
	 }*/
	 public void insert() {
		 int insert=jdbctemplate.update("insert into Student values(102,'amar','pythonfullstack')");
		 System.out.println(insert+"student inserted");
	 }
	 
	 public void delete() {
		 int delete=jdbctemplate.update("delete from Student where id=101");
		 System.out.println(delete+"student deleted");
	 }
	 public void updateRecord() {
		 int up=jdbctemplate.update("update Student set name='msd'where id='101'");
		 System.out.println(up+"student updated");
	 }
	 public void getoneRecord() {
		 List<Map <String, Object>>oneRecord=jdbctemplate.queryForList("select*from Student ");
		 Iterator it=oneRecord.iterator();
		 while(it.hasNext()) {
			 Object obj=it.next();
			 System.out.println(obj.toString());
		 }
	 }
}
