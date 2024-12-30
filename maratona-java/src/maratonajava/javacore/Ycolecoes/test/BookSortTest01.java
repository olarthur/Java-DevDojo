package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookByIdComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getId().compareTo(book2.getId());
    }
}

public class BookSortTest01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(6);
        books.add(new Book(5L, "Meditações", 37.90));
        books.add(new Book(1L, "O Manual de Epicteto", 34.90));
        books.add(new Book(4L, "A arte da guerra", 24.90));
        books.add(new Book(3L, "Sobre a brevidade da vida", 33.90));
        books.add(new Book(2L, "Retórica", 79.90));

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        Collections.sort(books); // chama o metodo compareTo internamente os na subescrição

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println();

//        Collections.sort(books, new BookByIdComparator());
        books.sort(new BookByIdComparator());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
