package dev.mohsenkohan.spring5webapp.repositories;

import dev.mohsenkohan.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
