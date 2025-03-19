package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.Book;
import es.angelkrasimirov.biblioteca.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		return ResponseEntity.ok(bookService.getAllBooks());
	}

	@GetMapping("/books/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable Long bookId) {
		Book book = bookService.getBookById(bookId);

		if (book == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(book);
	}

	@GetMapping("/authors/{authorId}/books")
	public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable Long authorId) {
		return ResponseEntity.ok(bookService.getBooksByAuthor(authorId));
	}

	@PostMapping("/authors/{authorId}/books")
	public ResponseEntity<Book> createBook(@PathVariable Long authorId, @RequestBody Book book) {
		Book newBook = bookService.saveBook(book, authorId);
		return ResponseEntity.ok(newBook);
	}
}
