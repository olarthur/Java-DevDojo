package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.dominio.Book;
import maratonajava.javacore.ZZDoptional.repositorio.BookRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Book> bookByTitle = BookRepository.findByTitle("Meditações");
        bookByTitle.ifPresent((b -> b.setTitle("Meditações" + " - Marco Aurélios")));

        System.out.println(bookByTitle);

        Book bookById = BookRepository.findByID(2).
                orElseThrow(IllegalArgumentException::new);
        System.out.println(bookById);

        Book newBook = BookRepository.findByTitle("Sobre a brevidade da vida")
                .orElseGet(() -> new Book(3, "Sobre a brevidade da vida", 14));
        System.out.println(newBook);
    }
}
