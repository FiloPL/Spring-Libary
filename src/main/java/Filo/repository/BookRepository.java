package Filo.repository;

import Filo.model.Book;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class BookRepository extends Book {
    private Set<Book> books = initialize();

    public BookRepository(int id, String author, String title) {
        super(id, author, title);
    }

    private Set<Book> initialize() {
        return new HashSet<>(Arrays.asList(new Book(1, "Testy", "Kaczanowski"),
                new Book(2, "Dzuma", "Camus"),
                new Book(3, "W pustyni i w puszczy", "Sienkiewicz"),
                new Book(4, "Pan Tadeusz", "Mickiewicz"),
                new Book(5, "Dziady", "Mickiewicz"),
                new Book(6, "Anioly i demony", "Brown"),
                new Book(7, "Gra o tron", "Martin"),
                new Book(8, "Harry Potter", "Rowling"),
                new Book(9, "Testy", "Kaczanowski"),
                new Book(10, "Testy", "Kaczanowski")));
    }


    //metoda do dodania ksiazki do seta
    public BookRepository addBook(Book book) {
        book.setId();//ustawiamy dodawanej ksiazce nastepne wolne id
        books.add(book);//dodajemy do seta
        return book; //zwracamy ksiazke z ustawionym id
    }

    public Set<Book> getBooks(String title) {
        return null;
    }

    public BookRepository rentBook(int id) {
        return null;
    }
   public BookRepository borrowedBook(String title, LocalDate date) {
        return null;
   }


    public void removeBook(int id) {
    }
}
