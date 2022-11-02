package vacheron.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import vacheron.springframework.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
