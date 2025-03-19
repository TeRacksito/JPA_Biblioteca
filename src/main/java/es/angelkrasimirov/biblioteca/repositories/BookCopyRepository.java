package es.angelkrasimirov.biblioteca.repositories;

import es.angelkrasimirov.biblioteca.models.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
}
