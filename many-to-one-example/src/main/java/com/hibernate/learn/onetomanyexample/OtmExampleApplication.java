package com.hibernate.learn.onetomanyexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.learn.onetomanyexample.dao.RepoImpl;
import com.hibernate.learn.onetomanyexample.entities.Customer;
import com.hibernate.learn.onetomanyexample.entities.LoanEntity;

@SpringBootApplication
public class OtmExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(OtmExampleApplication.class, args);
		
		/*   	
		 * 
		 
		LoanEntity loan1 = new LoanEntity();
		loan1.setLoan_id(1);
		loan1.setType("home");
		loan1.setAmount(500000);
		
		LoanEntity loan2= new LoanEntity();
		loan2.setLoan_id(2);
		loan2.setType("vehicle");
		loan2.setAmount(100000);
	
		LoanEntity loan3 = new LoanEntity();
		loan3.setLoan_id(3);
		loan3.setType("personal");
		loan3.setAmount(60000);
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(111);
		customer1.setCustomerName("AAA");
		
		loan1.setCustomer(customer1);
		loan2.setCustomer(customer1);
		loan3.setCustomer(customer1);
		
		RepoImpl.saveEntity(loan1);
		RepoImpl.saveEntity(loan2);
		RepoImpl.saveEntity(loan3);
		*/
		
		
		/*
		 * fetching the data 
		 */
		
		//RepoImpl.fetchEntity(1);
		
     /*
      * deleting the entity
      * 
      */
		
		RepoImpl.removeEntity(1);
	}

}
