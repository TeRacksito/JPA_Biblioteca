package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.BookGenre;
import es.angelkrasimirov.biblioteca.services.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookGenreController {

	@Autowired
	private BookGenreService bookGenreService;

	@GetMapping("/bookGenres")
	public ResponseEntity<List<BookGenre>> getBookGenres() {
		return ResponseEntity.ok(bookGenreService.getAllBookGenres());
	}

	@GetMapping("/bookGenres/{bookGenreId}")
	public ResponseEntity<BookGenre> getBookGenreById(@PathVariable Long bookGenreId) {
		BookGenre bookGenre = bookGenreService.getBookGenreById(bookGenreId);

		if (bookGenre == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(bookGenre);
	}

	@PostMapping("/bookGenres")
	public ResponseEntity<BookGenre> createBookGenre(@RequestBody BookGenre bookGenre) {
		BookGenre newBookGenre = bookGenreService.saveBookGenre(bookGenre);
		return ResponseEntity.ok(newBookGenre);
	}
}
