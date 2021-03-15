package kz.iitu.librarymidterm;

import kz.iitu.librarymidterm.config.Config;
import kz.iitu.librarymidterm.service.impl.PriceCalculatorService;
import kz.iitu.librarymidterm.service.impl.SalaryChangeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

public class LibrarySystem {
    public void menuShow() throws SQLException {
        Scanner in = new Scanner(System.in);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SalaryChangeService service = context.getBean(SalaryChangeService.class);
        PriceCalculatorService service1 = context.getBean(PriceCalculatorService.class);

        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Add user to database");
            System.out.println("2. Update salary of users");
            System.out.println("3. Add book to database");
            System.out.println("4. Update price of books");
            System.out.println("5. List of Librarians");
            System.out.println("6. List of books");
            System.out.println("0. Exit");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    service.create();
                    break;
                case 2:
                    service.updateSalary();
                    break;
                case 3:
                    service1.create();
                    break;
                case 4:
                    service1.updatePrice();
                    break;
                case 5:
                    service.getAll();
                    break;
                case 6:
                    service1.getAll();
                    break;
                case 0:
                    return;
            }
        }
    }
}
