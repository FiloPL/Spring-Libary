package Filo;

import Filo.model.Book;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

@Component
public class Menu {
​
    private final OrderService orderService;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
​
    public Menu(OrderService orderService) {
        this.orderService = orderService;
    }
​
    public void menu() {
        printOptions();
        try {
            String line = bufferedReader.readLine();
            makeDecision(Integer.parseInt(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
​
    private void printOptions() {
        System.out.println("1. Wypozycz");
        System.out.println("2. Oddaj");
        System.out.println("3. Dodaj");
        System.out.println("4. Usun");
        System.out.println("5. Pobierz wszystkie");
    }
​
    private void makeDecision(int decision) throws IOException {
        switch (decision) {
            case 1 :
                System.out.println("Podaj tytul.");
                String title = bufferedReader.readLine();
                Optional<Book> optionalBook = orderService.borrowBook(title);
                if (optionalBook.isPresent()) {
                    System.out.println(optionalBook.get());
                }
                System.out.println("Brak ksiazki na stanie");
                break;
            case 5:
                orderService.getBooks().forEach(System.out::println);
                break;
        }
    }
}

