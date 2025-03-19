package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.repositories.BookGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookGenreService {

	@Autowired
	private BookGenreRepository bookGenreRepository;
}
