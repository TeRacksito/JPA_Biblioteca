package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.repositories.BookCopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCopyService {

	@Autowired
	private BookCopyRepository bookCopyRepository;
}
