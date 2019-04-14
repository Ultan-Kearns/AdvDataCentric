package com.sales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@RequestMapping(value = "/listCustomer")
	public String listCustomer() {
		
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
