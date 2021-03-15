package kz.iitu.librarymidterm.repository;

import kz.iitu.librarymidterm.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
    Librarian getById(Long id);
}
