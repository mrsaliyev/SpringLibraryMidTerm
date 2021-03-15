package kz.iitu.librarymidterm.service.impl;

import kz.iitu.librarymidterm.model.Book;
import kz.iitu.librarymidterm.model.BookType;
import kz.iitu.librarymidterm.repository.BookRepository;
import kz.iitu.librarymidterm.service.IPriceCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class PriceCalculatorService implements IPriceCalculatorService {
    Scanner in = new Scanner(System.in);

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create() {
        System.out.println("Enter ISBN: ");
        long isbn = in.nextLong();
        System.out.print("Enter name: ");
        String name = in.next();
        System.out.print("Enter author: ");
        String author = in.next();
        System.out.print("Enter price: ");
        int price = in.nextInt();
        System.out.println("Enter published year: ");
        int year = in.nextInt();

        System.out.println("Choose Librarian Type: ");
        System.out.println("1." + BookType.FANTASY);
        System.out.println("2." + BookType.HISTORICAL);
        System.out.println("3." + BookType.HORROR);
        System.out.println("4." + BookType.LITERATURE);
        System.out.print("Choice : ");
        int choice = in.nextInt();

        BookType type;

        switch (choice){
            case 1:
                type = BookType.FANTASY;
                break;
            case 2:
                type = BookType.HISTORICAL;
                break;
            case 3:
                type = BookType.HORROR;
                break;
            case 4:
                type = BookType.LITERATURE;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        Book book1 = new Book();
        book1.setIsbn(isbn);
        book1.setName(name);
        book1.setAuthor(author);
        book1.setPrice(Double.valueOf(price));
        book1.setYearPublished(year);
        book1.setType(type);
        return bookRepository.save(book1);
    }

    @Override
    public void updatePrice() {
        System.out.print("Enter book ISBN: ");
        Long isbn = in.nextLong();
        Double price = bookRepository.getByIsbn(isbn).getPrice();

        System.out.println("1. Increase price ");
        System.out.println("2. Decrease price");
        int choice =in.nextInt();

        if (choice == 1) {
            System.out.print("Enter percentage of increase: ");
            int per = in.nextInt();
            double priceChange = price * (100 + per) / 100;
            bookRepository.getByIsbn(isbn).setPrice(priceChange);
        } else {
            System.out.print("Enter percentage of decrease: ");
            int per = in.nextInt();
            double priceChange = price * (100 - per) / 100;
            bookRepository.getByIsbn(isbn).setPrice(priceChange);
        }
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
