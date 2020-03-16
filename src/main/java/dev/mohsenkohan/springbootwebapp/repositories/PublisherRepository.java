package dev.mohsenkohan.springbootwebapp.repositories;

import dev.mohsenkohan.springbootwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
