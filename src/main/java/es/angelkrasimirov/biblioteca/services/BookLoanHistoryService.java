package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.repositories.BookLoanHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookLoanHistoryService {

	@Autowired
	private BookLoanHistoryRepository bookLoanHistoryRepository;
}
