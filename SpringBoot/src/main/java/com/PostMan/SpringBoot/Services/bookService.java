package com.PostMan.SpringBoot.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class bookService {
	private static List <Book> list=new ArrayList<>(); 
	static 
	{list.add(new Book(101,"java","James")); 
	list.add(new Book(102,"python","Guido Van Rossum"));} 
	public List<Book> getBooks() 
	{return List;} 
	public Book getBookById(int id) 	
	{Book book=null; 
	book=list.stream(). 
	filter(e->e.getId()==(id)).findFirst().get(); 
	return book;} 
	public void addBook(Book b) 
	{list.add(b);} 
	public void deleteBook(int bid) 
	{List=List.stream(). 
	filter(book->book.getId()!=bid) 
	.collect(Collectors.toList());} 
	public void updateBook(Book book,int bookId) 
	{list.stream().map(b->{if(b.getId()==bookId) 
	{ 
	b.setTitle(book.getTitle()); 
	b.setAuthor(book.getAuthor()); 
	} 
	return b;}).collect(Collectors.toList()); 
	} 
}
