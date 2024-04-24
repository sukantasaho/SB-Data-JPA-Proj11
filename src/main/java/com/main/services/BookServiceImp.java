package com.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Book;
import com.main.repository.IBookRepository;

@Service("bService")
public class BookServiceImp implements IBookService 
{
     
	@Autowired
	 private IBookRepository repo;
	
	@Override
	public String addBook(Book book) 
	{ 
		String status = null;
		
		 int id = repo.save(book).getBookId();
		  
		return "Record inserted with id-"+id;
	}

	@Override
	public String updateBookPrice(Integer id, Double price) 
	{
		    String msg = null;
		    Optional<Book> op = repo.findById(id);
		    if(op.isPresent())
		    {
		    	   Book b = op.get();
		    	   b.setBookPrice(price);
		    	   repo.save(b);
		    	   msg = "Book price is updated with id-"+id+" And New Price-"+price;
		    }
		    else
		    {
		    	msg ="Book is not found this id";
		    }
		return msg;
	}

	@Override
	public List<Book> getAllBooks() 
	{
		 
		return repo.findAll();
	}

}
