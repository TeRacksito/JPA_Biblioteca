package es.angelkrasimirov.biblioteca.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Book book;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private User user;
}
