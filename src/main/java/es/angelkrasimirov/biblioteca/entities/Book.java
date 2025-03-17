package es.angelkrasimirov.biblioteca.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@ManyToMany
	@JoinTable(name = "books_genres",
			joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private Set<BookGenre> genres = new LinkedHashSet<>();

	@Column(unique = true)
	private String uniqueCode;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookCopy> copies = new LinkedHashSet<>();

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public Set<BookCopy> getCopies() {
		return copies;
	}

	public void setCopies(Set<BookCopy> copies) {
		this.copies = copies;
	}

	public void addCopy(BookCopy copy) {
		this.copies.add(copy);
	}

	public void removeCopy(BookCopy copy) {
		this.copies.remove(copy);
	}
}