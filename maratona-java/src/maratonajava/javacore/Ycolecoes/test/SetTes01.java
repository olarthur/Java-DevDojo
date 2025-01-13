package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTes01 {
    public static void main(String[] args) {
        Set<Book> books = new LinkedHashSet<>();
        books.add(new Book(5L, "Meditações", 37.90, 0));
        books.add(new Book(1L, "O Manual de Epicteto", 34.90, 5));
        books.add(new Book(4L, "A arte da guerra", 24.90, 0));
        books.add(new Book(3L, "Sobre a brevidade da vida", 33.90, 2));
        books.add(new Book(2L, "Retórica", 79.90, 0));


        for (Book book : books) {
            System.out.println(book);
        }

    }
}
