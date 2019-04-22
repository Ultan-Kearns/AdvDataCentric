package com.sales.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Loan;
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
		c.add(Calendar.DATE, entity.getCust().getLoanPeriod()); // Adding 5 days
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

	@Override
	public Loan findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
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
