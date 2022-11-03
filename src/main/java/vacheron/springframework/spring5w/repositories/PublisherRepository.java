package vacheron.springframework.spring5w.repositories;

import vacheron.springframework.spring5w.domain.Publisher;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
