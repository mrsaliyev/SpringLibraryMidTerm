package kz.iitu.librarymidterm.service.impl;

import kz.iitu.librarymidterm.model.Librarian;
import kz.iitu.librarymidterm.model.LibrarianType;
import kz.iitu.librarymidterm.repository.LibrarianRepository;
import kz.iitu.librarymidterm.service.ISalaryChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

@Service
public class SalaryChangeService implements ISalaryChangeService {
    Scanner in = new Scanner(System.in);

    @Autowired
    private LibrarianRepository librarianRepository;

    @Override
    public Librarian create() {
        System.out.print("Enter name: ");
        String name = in.next();
        System.out.print("Enter surname: ");
        String surname = in.next();
        System.out.print("Enter salary: ");
        Integer salary = in.nextInt();

        System.out.println("Choose Librarian Type: ");
        System.out.println("1." + LibrarianType.ADMIN);
        System.out.println("2." + LibrarianType.ASSISTANT);
        System.out.print("Choice : ");
        int choice = in.nextInt();

        LibrarianType type;

        switch (choice){
            case 1:
                type = LibrarianType.ADMIN;
                break;
            case 2:
                type = LibrarianType.ASSISTANT;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        Librarian librarian = new Librarian();
        librarian.setType(type);
        librarian.setSalary(Double.valueOf(salary));
        librarian.setName(name);
        librarian.setSurname(surname);
        return librarianRepository.save(librarian);
    }

    @Override
    public void updateSalary() {
        System.out.print("Enter librarian ID: ");
        Long id = in.nextLong();
        Double salary = librarianRepository.getById(id).getSalary();

        System.out.println("1. Increase salary ");
        System.out.println("2. Decrease salary");
        int choice =in.nextInt();

        if (choice == 1) {
            System.out.print("Enter percentage of increase: ");
            int per = in.nextInt();
            librarianRepository.getById(id).setSalary(salary * (100 + per)/100);
        } else {
            System.out.print("Enter percentage of decrease: ");
            int per = in.nextInt();
            librarianRepository.getById(id).setSalary(salary * (100 - per)/100);
        }
    }

    @Override
    public List<Librarian> getAll() {
        return librarianRepository.findAll();
    }
}
