package kz.iitu.librarymidterm.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    private String name;
    private String author;
    private Double price;
    private Integer yearPublished;

    @Enumerated(EnumType.STRING)
    private BookType type;

    public Book() {
    }

    public Book(Long isbn, String name, String author, Double price, Integer yearPublished, BookType type) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
        this.type = type;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                ", type=" + type +
                '}';
    }
}
