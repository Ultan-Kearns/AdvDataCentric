package com.sales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoanController {
	@RequestMapping(value = "/listLoan")
	public String listLoan() {
		
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
