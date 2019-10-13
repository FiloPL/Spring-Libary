package Filo.service;

import Filo.model.Book;
import Filo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
public class OrderService {
    private final  BookRepository bookRepository;

    public OrderService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book borrowedBook(String title) {
        return bookRepository.borrowedBook(title, LocalDate.now().plusDays(30));
    }

    public Set<Book> getBooks(String title) {
        return bookRepository.getBooks(title);
    }

    public Book addBook(String title, String author) {
        return bookRepository.addBook(new Book(title,author));
    }

    public void removeBook(int id) {
        return bookRepository.removeBook();
    }


}
