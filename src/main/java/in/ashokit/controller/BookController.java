package in.ashokit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		ModelAndView mav = new ModelAndView();
		
		Book bookObj = new Book(101, "Spring", 400.00);
		mav.addObject("book",bookObj);
		mav.setViewName("bookView");
		return mav;
	}
	
	
	
	@GetMapping("/books")
	public ModelAndView getBooksData() {
		ModelAndView mav = new ModelAndView();
		
		Book b1 = new Book(101, "Spring", 400.00);
		Book b2 = new Book(102, "Python", 505.00);
		Book b3 = new Book(103, "Java", 450.00);
		Book b4 = new Book(104, "Design Patterns", 600.00);
		
		List<Book> booksList = Arrays.asList(b1,b2,b3,b4);
		
//		ArrayList<Book> booksList = new ArrayList<Book>();
//		booksList.add(bookObj1);
//		booksList.add(bookObj2);
//		booksList.add(bookObj3);
//		booksList.add(bookObj4);
//		
		mav.addObject("booksList",booksList);
		mav.setViewName("booksView");
		return mav;
	}

}
