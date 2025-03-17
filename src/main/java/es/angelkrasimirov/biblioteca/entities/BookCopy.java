package es.angelkrasimirov.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book_copies")
public class BookCopy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String uniqueIdentifier;

	@ManyToOne
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;

	@OneToOne
	@JoinColumn(name = "loan_id")
	private BookLoanHistory loan;

	public Long getId() {
		return id;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}