package com.sales.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue
	@Column(name="BID")
	//may change back to bid but then will have to change all methods
	private Long id;
		
	@Column(name="TITLE")
	@NotBlank
	private String title;
		
		
	@Column(name="AUTHOR")
	@NotBlank
	private String author;

	
	@OneToMany(mappedBy="book")
	private List<Loan> loans = new ArrayList<Loan>();


	public Long getid() {
		return id;
	}


	public void setid(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public List<Loan> getLoans() {
		return loans;
	}


	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
}