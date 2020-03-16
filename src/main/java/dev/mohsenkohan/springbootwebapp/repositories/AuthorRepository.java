package dev.mohsenkohan.springbootwebapp.repositories;

import dev.mohsenkohan.springbootwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
