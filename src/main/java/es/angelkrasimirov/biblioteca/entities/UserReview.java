package es.angelkrasimirov.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_reviews")
public class UserReview {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String review;

	private int rating;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
