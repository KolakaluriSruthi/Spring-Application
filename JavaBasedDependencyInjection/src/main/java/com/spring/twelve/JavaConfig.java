package com.spring.twelve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
      public Employee getBean() {
    	  Employee emp=new Employee();
    	  emp.setId(1);
    	  emp.setName("Anu");
    	  emp.setAddress(getBean1());
    	  return emp;
      }
	@Bean
      public Address getBean1() {
    	  Address addr=new Address();
    	  addr.setCity("Hyderabad");
    	  addr.setColony("punjagutta");
    	  addr.setState("Telangana");
    	  addr.setPin(520012);
    	  return addr;
      }
}
