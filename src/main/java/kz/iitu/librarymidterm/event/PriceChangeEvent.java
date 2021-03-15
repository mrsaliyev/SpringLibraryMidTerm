package kz.iitu.librarymidterm.event;

import kz.iitu.librarymidterm.model.Book;
import org.springframework.context.ApplicationEvent;

public class PriceChangeEvent extends ApplicationEvent {
    private final Book book;

    public PriceChangeEvent(Object source, Book book) {
        super(source);
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
