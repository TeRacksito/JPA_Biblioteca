package es.angelkrasimirov.biblioteca.repositories;


import es.angelkrasimirov.biblioteca.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
