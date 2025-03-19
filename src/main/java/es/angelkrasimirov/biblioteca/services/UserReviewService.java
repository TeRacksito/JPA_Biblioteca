package es.angelkrasimirov.biblioteca.services;

import es.angelkrasimirov.biblioteca.repositories.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReviewService {

	@Autowired
	private UserReviewRepository userReviewRepository;
}
