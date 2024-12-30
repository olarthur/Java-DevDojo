package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;
import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarca implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarca());
        Smartphone smartphone = new Smartphone("0101", "Nokia");

        set.add(smartphone);

        NavigableSet<Book> books = new TreeSet<>(new BookPriceComparator());
        books.add(new Book(5L, "Meditações", 37.90, 0));
        books.add(new Book(1L, "O Manual de Epicteto", 34.90, 5));
        books.add(new Book(4L, "A arte da guerra", 24.90, 0));
        books.add(new Book(3L, "Sobre a brevidade da vida", 33.90, 2));
        books.add(new Book(2L, "Retórica", 79.90, 0));

        for (Book book : books) {
            System.out.println(book);
        }

        Book iliada = new Book(4L, "Ilíada", 41.2, 5);

        /*
         lower <
         floor <=
         higher >
         ceiling >=
        */

        System.out.println("-------------------");
        System.out.println(books.lower(iliada));
        System.out.println(books.floor(iliada));
        System.out.println(books.higher(iliada));
        System.out.println(books.ceiling(iliada));

        System.out.println(books.size());
        System.out.println(books.pollFirst());
        System.out.println(books.size());
    }
}
