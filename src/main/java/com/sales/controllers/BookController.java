package com.sales.controllers;

import java.util.ArrayList;
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

import com.sales.models.Book;
import com.sales.models.Customer;
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
public String addBook(Model model) {
	model.addAttribute("book1", new Book());
	return "addBook";
}
@RequestMapping(value = "/addNewBook",method=RequestMethod.POST)
public String addNewBook(@ModelAttribute ("book1") Book book,
		  HttpServletRequest h) {
			service.save(book);
			return "redirect:/showBooks";
}
}
