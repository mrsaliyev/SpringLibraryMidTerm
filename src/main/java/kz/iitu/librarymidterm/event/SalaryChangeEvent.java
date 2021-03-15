package kz.iitu.librarymidterm.event;

import kz.iitu.librarymidterm.model.Librarian;
import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {
    private final Librarian librarian;

    public SalaryChangeEvent(Object source, Librarian librarian) {
        super(source);
        this.librarian = librarian;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
}
