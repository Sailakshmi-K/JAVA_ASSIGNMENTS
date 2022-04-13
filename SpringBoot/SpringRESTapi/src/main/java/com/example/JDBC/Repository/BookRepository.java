package com.example.JDBC.Repository;

import java.util.List;

import com.example.JDBC.model.Book;



public interface BookRepository {
	public int insertBook(Book b);
	public int updateBook(String s,float p);
	public void deleteBook(int bid);
	public List<Book> getAllbooks();

}
