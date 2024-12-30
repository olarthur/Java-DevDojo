package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(6);
        books.add(new Book(5L, "Meditações", 37.90));
        books.add(new Book(1L, "O Manual de Epicteto", 34.90));
        books.add(new Book(4L, "A arte da guerra", 24.90));
        books.add(new Book(3L, "Sobre a brevidade da vida", 33.90));
        books.add(new Book(2L, "Retórica", 79.90));

//        Collections.sort(books);
        books.sort(new BookByIdComparator());

        for (Book book : books) {
            System.out.println(book);
        }

        Book bookToSearch = new Book(2L, "Retórica", 79.90);

        System.out.println(Collections.binarySearch(books, bookToSearch, new BookByIdComparator()));
    }
}
