package com.spring.eight.PropertyInterface;

import java.util.*;
public class AmeerpetTechnologies {
         private Properties studentBatches;
         public AmeerpetTechnologies() {
        	 super();
         }
         public AmeerpetTechnologies(Properties studentBatches) {
        	 this.studentBatches=studentBatches;
         }
         public void setStudentBatches(Properties studentBatches) {
        	 this.studentBatches=studentBatches;
         }
         public Properties getStudentBatches() {
        	 return this.studentBatches;
         }
         public void print() {
        	 Set<String>keys=studentBatches.stringPropertyNames();
        	 for(String key:keys) {
        		 System.out.println(key+":"+studentBatches.getProperty(key));
        	 }
         }
}
