package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.services.BookCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookCopies")
public class BookCopyController {

	@Autowired
	private BookCopyService bookCopyService;
}
