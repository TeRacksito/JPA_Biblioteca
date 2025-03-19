package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.BookCopy;
import es.angelkrasimirov.biblioteca.services.BookCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookCopyController {

	@Autowired
	private BookCopyService bookCopyService;

//	@GetMapping("/book-copies")
//	public ResponseEntity<List<BookCopy>> getBookCopies() {
//		return ResponseEntity.ok(bookCopyService.getAllBookCopies());
//	}

	@GetMapping("/book-copies/{bookCopyId}")
	public ResponseEntity<BookCopy> getBookCopyById(@PathVariable Long bookCopyId) {
		BookCopy bookCopy = bookCopyService.getBookCopyById(bookCopyId);

		if (bookCopy == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(bookCopy);
	}

//	@PostMapping("/book-copies")
//	public ResponseEntity<BookCopy> createBookCopy(@RequestBody BookCopy bookCopy) {
//		BookCopy newBookCopy = bookCopyService.saveBookCopy(bookCopy);
//		return ResponseEntity.ok(newBookCopy);
//	}

	@GetMapping("/books/{bookId}/book-copies")
	public ResponseEntity<List<BookCopy>> getBookCopiesByBook(@PathVariable Long bookId) {
		return ResponseEntity.ok(bookCopyService.getBookCopiesByBook(bookId));
	}
}
