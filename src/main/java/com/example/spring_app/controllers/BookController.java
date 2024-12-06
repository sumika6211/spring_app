package com.example.spring_app.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring_app.domains.Book;
import com.example.spring_app.mappers.BookMapper;

@Controller
public class BookController {
	private final BookMapper bookMapper;
	
	@Autowired
	public BookController(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@PostMapping("/create")
	public String create(@RequestParam("book_title") String bookTitle, @RequestParam("book_body") String bookBody) {
		Book book = new Book(bookTitle, bookBody);
		bookMapper.add(book);
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Book> books = bookMapper.all();
		model.addAttribute("books", books);
		return "index";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Integer book_id, Model model) {
		Book book = bookMapper.show(book_id);
		model.addAttribute("book", book);
		return "show";
	}
}
