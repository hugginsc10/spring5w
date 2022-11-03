package vacheron.springframework.spring5w.repositories;

import vacheron.springframework.spring5w.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
