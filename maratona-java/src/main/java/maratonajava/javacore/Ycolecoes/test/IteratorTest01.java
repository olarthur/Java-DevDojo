package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(6);
        books.add(new Book(5L, "Meditações", 37.90, 0));
        books.add(new Book(1L, "O Manual de Epicteto", 34.90, 5));
        books.add(new Book(4L, "A arte da guerra", 24.90, 0));
        books.add(new Book(3L, "Sobre a brevidade da vida", 33.90, 2));
        books.add(new Book(2L, "Retórica", 79.90, 0));

        Iterator<Book> bookIterator = books.iterator();

        while (bookIterator.hasNext()) {

            if (bookIterator.next().getAmount() == 0) {
                bookIterator.remove();
            }
        }

        // mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(books);

    }
}
