package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.models.Author;
import es.angelkrasimirov.biblioteca.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	public Author getAuthorById(Long id) {
		return authorRepository.findById(id).orElse(null);
	}

	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}
}
