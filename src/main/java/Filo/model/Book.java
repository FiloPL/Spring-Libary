package Filo.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;


public class Book {

    private int id;
    private String title;
    private String author;
    private LocalDate borrowedTill;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getBorrowedTill() {
        return borrowedTill;
    }

    public void setBorrowedTill(LocalDate borrowedTill) {
        this.borrowedTill = borrowedTill;
    }

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.id = id;
        this.author = author;
    }

    @Override
    public boolean equals ( Object object) {
        if(this == object) {
            return true;
        }
        if(object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author='" + author + '\''
                + ", borrowedTill=" + borrowedTill + '}';
    }

}