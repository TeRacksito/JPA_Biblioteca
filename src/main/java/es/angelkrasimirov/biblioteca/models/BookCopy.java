package es.angelkrasimirov.biblioteca.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Book book;

	@OneToOne
	@JoinColumn(name = "loan_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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

	public BookLoanHistory getLoan() {
		return loan;
	}

	public void setLoan(BookLoanHistory loan) {
		this.loan = loan;
	}
}