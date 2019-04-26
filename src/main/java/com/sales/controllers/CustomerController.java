package com.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String addCustomer(Model model) {
        model.addAttribute("customer1", new Customer());
		return "addCustomer";
	}
	@RequestMapping(value = "/addNewCustomer",
            method=RequestMethod.POST)
	public String addNewCustomer(  
			  @ModelAttribute ("customer1") Customer c,
			  HttpServletRequest h,ModelMap map) {
		if(c.getLoanPeriod() == 0)
		{
			return "/addCustomer";
		}
				custService.save(c);
				return "redirect:/listCustomer";
	}
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
}
