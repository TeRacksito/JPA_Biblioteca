package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.models.BookCopy;
import es.angelkrasimirov.biblioteca.repositories.BookCopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopyService {

	@Autowired
	private BookCopyRepository bookCopyRepository;

	public List<BookCopy> getAllBookCopies() {
		return bookCopyRepository.findAll();
	}

	public BookCopy getBookCopyById(Long bookCopyId) {
		return bookCopyRepository.findById(bookCopyId).orElse(null);
	}

	public BookCopy saveBookCopy(BookCopy bookCopy) {
		return bookCopyRepository.save(bookCopy);
	}


	public List<BookCopy> getBookCopiesByBook(Long bookId) {
		return bookCopyRepository.findByBookId(bookId);
	}
}
