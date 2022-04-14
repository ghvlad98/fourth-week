package com.corso.java.repository;

import com.corso.java.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
    @Query("{id :?0}")
    Optional<Book> getBookById(Integer id);

    @Query("{pages: {$lt: ?0}}")
    List<Book> getBookByPages(Integer pages);

    @Query("{$or :[{author: ?0},{name: ?1}]}")
    List<Book> getBooksByAuthorOrName(String author, String name);

    @Query(value ="{author: ?0}", count=true)
    Integer getBooksCountByAuthor(String author);

    @Query(value = "{author:?0}", sort= "{name:1}")
    List<Book> getBooksByAuthorSortByName(String author);
}
