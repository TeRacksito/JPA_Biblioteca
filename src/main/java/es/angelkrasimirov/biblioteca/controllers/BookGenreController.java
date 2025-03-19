package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.services.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book-genres")
public class BookGenreController {

	@Autowired
	private BookGenreService bookGenreService;

}
