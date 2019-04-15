package com.sales.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sales.models.Book;
import com.sales.repositories.BookRepository;
import com.sales.services.BookService;

@Controller
@EnableJpaRepositories("com.sales.repositories")
public class BookController {
	@Autowired
	BookService service;
@RequestMapping(value = "/showBooks")
public String listBook(Model model) {
    List<Book> book = service.findAll();
    model.addAttribute("book", book);
	return "showBooks";
}
@RequestMapping(value = "/addBook")
public String addBook() {
	
	return "addBook";
}
public String insertBook(String title,String author) {
	return null;
	
}
}
