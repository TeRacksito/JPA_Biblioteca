package es.angelkrasimirov.biblioteca.repositories;

import es.angelkrasimirov.biblioteca.models.BookLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookLoanHistoryRepository extends JpaRepository<BookLoanHistory, Long> {
}
