package com.spring.eight._MapInterface;

import java.util.*;
public class AmeerpetTechnologies {
          private Map<String,String>studentCourses;
          public AmeerpetTechnologies() {
        	  super();
          }
          public AmeerpetTechnologies(Map<String,String>studentCourses) {
        	  this.studentCourses=studentCourses;
          }
          public void setStudentCourses(Map<String,String>studentCourses) {
        	   this.studentCourses=studentCourses;
          }
          public Map<String,String> getStudentCourse(){
        	  return this.studentCourses;
          }
          public void print() {
        	  System.out.println("Student Courses");
        	  for(Map.Entry<String,String>entry:studentCourses.entrySet()) {
        		  System.out.println(entry.getKey()+":"+entry.getValue());
        	  }
          }
}
