package com.sales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Book;
import com.sales.repositories.BookRepository;

@Service
public class BookService implements BookRepository {
	@Autowired
	private BookRepository bookRepo;
	@Override
	public <S extends Book> S save(S entity) {
		bookRepo.save(entity);
		return entity;
	}
	@Override
	public <S extends Book> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Book findOne(Long id) {
		Book b = bookRepo.findOne(id);
		if(b == null)
		{
			return null;
		}
		return b;
	}
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterable<Book> findAll(Iterable<Long> ids) {
		return null;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Book> findAll() {
		List<Book> books = (List<Book>) bookRepo.findAll();
        return books;
	}
}
