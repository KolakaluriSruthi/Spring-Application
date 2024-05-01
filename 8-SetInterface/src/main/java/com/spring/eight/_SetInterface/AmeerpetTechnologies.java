package com.spring.eight._SetInterface;
import java.util.Set;
public class AmeerpetTechnologies {
        private Set<Integer>studentRollNumbers;
        public AmeerpetTechnologies() {
        	super();
        }
        public  AmeerpetTechnologies(Set<Integer> studentRollNumbers) {
        
        	this.studentRollNumbers=studentRollNumbers;
        }
        public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
        	this.studentRollNumbers=studentRollNumbers;
        }
        public Set<Integer> getStudentRollNumbers(){
        	return this.studentRollNumbers;
        }
        public void print() {
        	System.out.println("Student RollNumbers");
        	for(Integer rollnumbers:studentRollNumbers) {
        		System.out.println(rollnumbers);
        	}
        }
}
