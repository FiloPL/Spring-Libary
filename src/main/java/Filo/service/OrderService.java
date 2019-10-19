package Filo.service;

import Filo.model.Book;
import Filo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;

@Service
public class OrderService {
    private final BookRepository bookRepository;

    public OrderService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> borrowBook(String title) {
        return bookRepository.borrowBook(title, LocalDate.now().plusDays(30));
    }

    public Book addBook(String title, String author) {
        Book bookToAdd = new Book(title, author);
        return bookRepository.addBook(bookToAdd);
    }

    public void removeBook(int id) {
        bookRepository.removeBook(id);
    }

    public void returnBook(int id) {
        bookRepository.returnBook(id);
    }

    public Set<Book> getBooks() {
        return bookRepository.getBooks();
    }


}
