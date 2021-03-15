package kz.iitu.librarymidterm.model;

import javax.persistence.*;

@Entity
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Double salary;

    @Enumerated(EnumType.STRING)
    private LibrarianType type;

    public Librarian() {
    }

    public Librarian(Long id, String name, String surname, Double salary, LibrarianType type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LibrarianType getType() {
        return type;
    }

    public void setType(LibrarianType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
