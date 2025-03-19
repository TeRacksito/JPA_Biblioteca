package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.models.Author;
import es.angelkrasimirov.biblioteca.models.Book;
import es.angelkrasimirov.biblioteca.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorService authorService;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public Book saveBook(Book book, Long authorId) {
		Author author = authorService.getAuthorById(authorId);
		book.setAuthor(author);
		return bookRepository.save(book);
	}

	public List<Book> getBooksByAuthor(Long authorId) {
		return bookRepository.findByAuthorId(authorId);
	}
}
