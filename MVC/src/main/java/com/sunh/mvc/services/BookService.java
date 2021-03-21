package com.sunh.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sunh.mvc.models.Book;
import com.sunh.mvc.repositories.BookRepository;

@Service
public class BookService {
	  // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // updates a book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book book = findBook(id);
    	book.setTitle(title);
        book.setDescription(desc);
        book.setLanguage(lang);
        book.setNumberOfPages(numOfPages);
    	return bookRepository.save(book);
    }
    // deletes a book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
        
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void updateBook(@Valid Book book) {
		// TODO Auto-generated method stub
		updateBook(book.getId(), book.getTitle(), book.getDescription(), book.getLanguage(), book.getNumberOfPages());
	}
}
