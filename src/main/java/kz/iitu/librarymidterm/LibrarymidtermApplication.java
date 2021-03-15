package kz.iitu.librarymidterm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class LibrarymidtermApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(LibrarymidtermApplication.class, args);

        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.menuShow();
    }

}