package com.smeetbhatt.springbootin10steps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smeetbhatt.springbootin10steps.model.Book;

import java.util.List;
import java.util.Arrays;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1l, "Book One", "Author One"),
				new Book(2l, "Book Two", "Author Two"),
				new Book(3l, "Book Three", "Author Three"),
				new Book(3l, "Book Four", "Author Four")
				);
	}
}
