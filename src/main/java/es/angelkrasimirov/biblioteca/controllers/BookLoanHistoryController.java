package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.services.BookLoanHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book-loan-history")
public class BookLoanHistoryController {

	@Autowired
	private BookLoanHistoryService bookLoanHistoryService;
}
