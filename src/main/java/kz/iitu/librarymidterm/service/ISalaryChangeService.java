package kz.iitu.librarymidterm.service;

import kz.iitu.librarymidterm.model.Librarian;

import java.util.List;

public interface ISalaryChangeService {
    Librarian create();
    void updateSalary();
    List<Librarian> getAll();
}
