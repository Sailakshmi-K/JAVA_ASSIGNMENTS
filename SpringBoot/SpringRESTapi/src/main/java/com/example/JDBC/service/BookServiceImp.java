package com.example.JDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.JDBC.Repository.BookRepository;
import com.example.JDBC.model.Book;

@Service
public class BookServiceImp implements BookService {
	
	@Autowired
	private BookRepository bookrepo;

	@Transactional
	@Override
	public int insertBook(Book b) {
		
		return bookrepo.insertBook(b);
	}
	
	@Transactional
	@Override
	public int updateBook(String s, float p) {
		// TODO Auto-generated method stub
		return bookrepo.updateBook(s, p);
	}

	@Transactional
	@Override
	public void deleteBook(int bid) {
		// TODO Auto-generated method stub
		bookrepo.deleteBook(bid);
		
	}

	@Transactional
	@Override
	public List<Book> getAllbooks() {
		// TODO Auto-generated method stub
		return bookrepo.getAllbooks();
	}

}
