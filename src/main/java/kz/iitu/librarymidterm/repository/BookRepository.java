package kz.iitu.librarymidterm.repository;

import kz.iitu.librarymidterm.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book getByIsbn(Long id);
}
