package com.hibernate.learn.onetomanyexample.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_LOANS")
public class LoanEntity {

	@Id
	@Column(name = "LOAN_ID")
	private int loan_id;
	
	@Column(name = "AMOUNT")
	private int amount;
	
	@Column(name = "TYPE")
	private String type;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	public int getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "LoanEntity [loan_id=" + loan_id + ", amount=" + amount + ", type=" + type + "]";
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Customer getCustomer(Customer customer) {
		return customer;
	}
	
}
