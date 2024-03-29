package com.sales.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Loan;
import com.sales.repositories.CustomerRepository;
import com.sales.repositories.LoanRepository;
@Service
public class LoanService implements LoanRepository{
	@Autowired
	LoanRepository LoanRepo;
	@Override
	public <S extends Loan> S save(S entity) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, entity.getCust().getLoanPeriod()); // add loan period to current date
		String dateString = formatter.format(c.getTime());
		entity.setDueDate(dateString);
		LoanRepo.save(entity);
		return entity;
	}

	@Override
	public <S extends Loan> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	public Loan compareBooks(long id) {
		ArrayList<Loan> loans = (ArrayList<Loan>) LoanRepo.findAll();
		for(int i = 0; i < loans.size(); i++)
		{
			Loan l = (Loan) loans.get(i);
			if(l.getBook().getid() == id)
			{
				return l;
			}
		}
		return null;
	}
	@Override
	public Loan findOne(Long id) {
		return null;
		
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		if(LoanRepo.exists(id))
		{
		return true;
		}
		else {
			return false;
		}
	}
	@Override
	public Iterable<Loan> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
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
	public void delete(Loan entity) {
		 LoanRepo.delete(entity);	
	}

	@Override
	public void delete(Iterable<? extends Loan> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Loan> findAll() {
		//not retrieving loans
		List<Loan> loans = (List<Loan>) LoanRepo.findAll();
        return loans;
	}

}
