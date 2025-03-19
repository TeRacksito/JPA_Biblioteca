package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.models.BookGenre;
import es.angelkrasimirov.biblioteca.repositories.BookGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookGenreService {

	@Autowired
	private BookGenreRepository bookGenreRepository;

	public List<BookGenre> getAllBookGenres() {
		return bookGenreRepository.findAll();
	}

	public BookGenre getBookGenreById(Long bookGenreId) {
		return bookGenreRepository.findById(bookGenreId).orElse(null);
	}

	public BookGenre saveBookGenre(BookGenre bookGenre) {
		return bookGenreRepository.save(bookGenre);
	}
}
