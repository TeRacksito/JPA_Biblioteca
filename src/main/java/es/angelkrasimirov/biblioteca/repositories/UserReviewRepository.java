package es.angelkrasimirov.biblioteca.repositories;

import es.angelkrasimirov.biblioteca.models.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReviewRepository extends JpaRepository<UserReview, Long> {
}
