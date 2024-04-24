package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.main.entity.Book;
import com.main.entity.Book;
import com.main.services.IBookService;

@SpringBootApplication
public class SbDataJpaProj11Application {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(SbDataJpaProj11Application.class, args);
		  IBookService service = ctx.getBean("bService", IBookService.class);
			try
			{
			  Book b1 = new Book("Fair Play","John sen",450d,2022);
			  String msg = service.addBook(b1);
			  System.out.println(msg);
			}
			catch(Exception e)
			{
			  e.printStackTrace();
			}
			/* try
			 {
			  String msg = service.updateBookPrice(10000,800.0);
			  System.out.println(msg);
			 }
			 catch(Exception e)
			 {
			  e.printStackTrace();
			 }*/
			 try
			 {
			  service.getAllBooks().forEach(b->System.out.println(b.getBookId()+" "+b.getBookName()+" "+b.getBookAuthor()+" "+b.getCount_update()+" "+b.getBookPrice()+" "+b.getCreatedDate()+" "+b.getLastModifiedDate()+" "+b.getPublishYear()));
			   
			 }
			 catch(Exception e)
			 {
			  e.printStackTrace();
			 }
		 
	}

}
