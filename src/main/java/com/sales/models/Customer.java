package com.sales.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="CID")
	private Long id;

	@Column(name="CNAME")
	@NotBlank
	private String cName;
	
	
	@Column(name="LOANPERIOD")
	@Min(value=1)
	private int loanPeriod;
	
	@OneToMany(targetEntity =Loan.class, mappedBy="cust")
	private List<Loan> loans = new ArrayList<Loan>();

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

}