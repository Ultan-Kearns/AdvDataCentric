package com.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Book;
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
	public String addLoan(Model model) {
		model.addAttribute("loan1", new Loan());
		return "addLoan";
	}
	@RequestMapping(value = "/deleteLoan")
	public String deleteLoan(Model model) {
		model.addAttribute("loan1", new Loan());
		return "deleteLoan";
	}
	@RequestMapping(value = "/addNewLoan",method=RequestMethod.POST)
	public String addNewLoan(@ModelAttribute ("loan1") Loan loan,
			  HttpServletRequest h) {			
				service.save(loan);
				return "redirect:/listLoan";
	}
	@RequestMapping(value = "/deleteLoan",method=RequestMethod.POST)
	public String deleteLoan(@ModelAttribute ("loan1") Loan loan,
			  HttpServletRequest h) {		
		service.delete(loan);
		return "redirect:/listLoan";
	}
}
