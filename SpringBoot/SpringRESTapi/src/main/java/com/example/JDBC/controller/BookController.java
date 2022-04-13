package com.example.JDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JDBC.model.Book;
import com.example.JDBC.service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	//insert--postMapping
	@PostMapping(path="/save")
	public String saveController(@RequestBody Book b) {
		int i=bookservice.insertBook(b);
		if(i>0) {
			return "Inserted successfully";
		}
		else {
			return "Try again !!";
		}
	}
	
	//update--putMapping
	@PutMapping(path="update/{name}/{p}")
	public String updateController(@PathVariable String name,@PathVariable float p) {
		int i=bookservice.updateBook(name, p);
		if (i>0){
		return "Updated";
	}
		else {
			return "Try again !!";
		}
	}
	
	//delete--deleteMApping
	@DeleteMapping(path="delete/{bid}")
	public String deleteController(@PathVariable int bid) {
		bookservice.deleteBook(bid);
	return "Deleted successfully";	
	}
	
	//getAll--getMapping
	@GetMapping(path="getAllPaths")
	public List<Book> fetchController(){
		return bookservice.getAllbooks();
		
	}
	
}