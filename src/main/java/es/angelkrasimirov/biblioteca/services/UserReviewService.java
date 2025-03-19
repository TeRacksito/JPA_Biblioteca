package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.models.UserReview;
import es.angelkrasimirov.biblioteca.repositories.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReviewService {

	@Autowired
	private UserReviewRepository userReviewRepository;

	public UserReview getUserReviewById(Long id) {
		return userReviewRepository.findById(id).orElse(null);
	}

	public List<UserReview> getUserReviewsByBook(Long bookId) {
		return userReviewRepository.findByBookId(bookId);
	}

	public List<UserReview> getUserReviewsByUser(Long userId) {
		return userReviewRepository.findByUserId(userId);
	}
}
