package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Integer>
{

}
