package com.sales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
@RequestMapping(value = "/showBooks")
public String listBook() {
	
	return "showBooks";
}
@RequestMapping(value = "/addBook")
public String addBook() {
	
	return "addBook";
}
}
