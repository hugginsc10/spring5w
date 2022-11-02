package vacheron.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vacheron.springframework.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
