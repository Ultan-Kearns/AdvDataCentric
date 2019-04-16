package com.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sales.models.Loan;
import com.sales.services.LoanService;

@Controller
@EnableJpaRepositories("com.sales.repositories")
public class LoanController {
	@Autowired
	LoanService service;
	@RequestMapping(value = "/listLoan")
	public String listLoan(Model model) {
	    List<Loan> loan = service.findAll();
	    model.addAttribute("loan", loan);
		return "listLoan";
	}
	@RequestMapping(value = "/addLoan")
	public String addLoan() {
		
		return "addLoan";
	}
	@RequestMapping(value = "/deleteLoan")
	public String deleteLoan() {
		
		return "deleteLoan";
	}
}
