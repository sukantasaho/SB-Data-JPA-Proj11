package com.main.services;

import java.util.List;

import com.main.entity.Book;

public interface IBookService 
{
     public String addBook(Book book);
     public String updateBookPrice(Integer id, Double price);
     public List<Book> getAllBooks();
}
