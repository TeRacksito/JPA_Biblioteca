package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.UserReview;
import es.angelkrasimirov.biblioteca.services.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserReviewController {

	@Autowired
	private UserReviewService userReviewService;

	@GetMapping("/user-reviews/{userReviewId}")
	public ResponseEntity<UserReview> getUserReviewById(@PathVariable Long userReviewId) {
		UserReview userReview = userReviewService.getUserReviewById(userReviewId);

		if (userReview == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(userReview);
	}

	@GetMapping("/books/{bookId}/user-reviews")
	public ResponseEntity<List<UserReview>> getUserReviewsByBook(@PathVariable Long bookId) {
		return ResponseEntity.ok(userReviewService.getUserReviewsByBook(bookId));
	}

	@GetMapping("/users/{userId}/user-reviews")
	public ResponseEntity<List<UserReview>> getUserReviewsByUser(@PathVariable Long userId) {
		return ResponseEntity.ok(userReviewService.getUserReviewsByUser(userId));
	}
}
