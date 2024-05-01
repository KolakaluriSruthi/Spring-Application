package com.spring.seven.ObjectCollection;
import java.util.List;
public class AmeerpetTechnologiesBean {
 private List<String>studentNames;
 public AmeerpetTechnologiesBean() {
	 super();
 }
 public AmeerpetTechnologiesBean(List<String> studentNames) {
	 this.studentNames=studentNames;
 }
 public void setStudentNames(List<String> studentNames) {
	 this.studentNames=studentNames;
 }
 public List<String> getStudentNames(){
	 return studentNames;
 }
 public void print() {
	 for(String studentname:studentNames) {
		 System.out.println(studentname);
	 }
 }
}
