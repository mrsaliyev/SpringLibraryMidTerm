package kz.iitu.librarymidterm;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.menuShow();
    }
}
