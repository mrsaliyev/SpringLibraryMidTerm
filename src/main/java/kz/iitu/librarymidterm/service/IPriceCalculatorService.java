package kz.iitu.librarymidterm.service;

import kz.iitu.librarymidterm.model.Book;

import java.util.List;

public interface IPriceCalculatorService {
    Book create();
    void updatePrice();
    List<Book> getAll();
}
