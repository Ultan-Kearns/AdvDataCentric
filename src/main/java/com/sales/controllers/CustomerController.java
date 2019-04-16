package com.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sales.models.Book;
import com.sales.models.Customer;
import com.sales.services.CustomerService;

@Controller
@EnableJpaRepositories("com.sales.repositories")
public class CustomerController {
	@Autowired
	CustomerService custService;
	@RequestMapping(value = "/listCustomer")
	public String listCustomer(Model model) {
	    List<Customer> customer = custService.findAll();
	    model.addAttribute("customer", customer);
		return "listCustomer";
	}
	@RequestMapping(value = "/addCustomer")
	public String addCustomer() {
		
		return "addCustomer";
	}
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
}
