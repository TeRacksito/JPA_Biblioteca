package es.angelkrasimirov.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book_loans")
public class BookLoanHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "book_copy_id")
	private BookCopy bookCopy;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private String loanDate;

	private String returnDate;

	public Long getId() {
		return id;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
}
