package Filo.model;

import java.util.Date;
import java.util.Objects;


public class Book {

    private int id;
    private String author;
    private String title;
    private Date dateRentBook;
    private Date dateGiveBack;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.id = id;
        this.author = author;
    }

    public Date getDateRentBook() {
        return dateRentBook;
    }

    public void setDateRentBook(Date dateRentBook) {
        this.dateRentBook = dateRentBook;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateGiveBack() {
        return dateGiveBack;
    }

    public void setDateGiveBack(Date dateGiveBack) {
        this.dateGiveBack = dateGiveBack;
    }

    public boolean equals( Object objcetE ) {
        if(this == objcetE) {
            return true;
        }

        if (objcetE == null || getClass() == objcetE.getClass() ) {
            return false;
        }
        Book book = (Book) objcetE;
        return id == book.id;


    }
    public int haskCode() {
        return Objects.hash(id);
    }


}
