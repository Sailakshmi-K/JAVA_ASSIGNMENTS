package com.example.JDBC.service;

import java.util.List;

import com.example.JDBC.model.Book;

public interface BookService {
	public int insertBook(Book b);
	public int updateBook(String s,float p);
	public void deleteBook(int bid);
	public List<Book> getAllbooks();
	
}
