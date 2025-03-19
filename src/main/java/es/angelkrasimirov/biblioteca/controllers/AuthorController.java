package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.Author;
import es.angelkrasimirov.biblioteca.models.Book;
import es.angelkrasimirov.biblioteca.services.AuthorService;
import es.angelkrasimirov.biblioteca.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@Autowired
	private BookService bookService;

	@GetMapping("/authors")
	public ResponseEntity<List<Author>> getAllAuthors() {
		return ResponseEntity.ok(authorService.getAllAuthors());
	}

	@GetMapping("/authors/{authorId}")
	public ResponseEntity<Author> getAuthorById(@PathVariable Long authorId) {
		Author author = authorService.getAuthorById(authorId);

		if (author == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(author);
	}

	@PostMapping("/authors")
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
		return ResponseEntity.ok(authorService.saveAuthor(author));
	}
}
