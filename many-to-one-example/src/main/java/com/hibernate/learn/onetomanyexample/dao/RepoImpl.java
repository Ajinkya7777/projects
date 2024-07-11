package com.hibernate.learn.onetomanyexample.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.learn.onetomanyexample.entities.LoanEntity;

@Service
public class RepoImpl {

	private static MyRepository repo;

	@Autowired
	public RepoImpl(MyRepository repo) {
		this.repo = repo;
	}

	public static void saveEntity(LoanEntity loan) {
		// to insert the data
		repo.save(loan);
	}

	public static void fetchEntity(int loanId) {
		// to fetch the data ( fetch = fetchType.EAGER OR fetchType.LAZY)
		Optional<LoanEntity> optional = repo.findById(loanId);
		if (optional.get() != null) {
			LoanEntity loan = optional.get();
			System.out.println(loan);

		}
	}

	public static void removeEntity(int loanId) {
		Optional<LoanEntity> optional = repo.findById(loanId);
		if (optional.get() != null) {
			repo.deleteById(loanId);
			System.out.println("Loan deleted suscessfully with Id :"+loanId);
		}
	}

}
