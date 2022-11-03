package vacheron.springframework.spring5w.repositories;

import vacheron.springframework.spring5w.domain.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
