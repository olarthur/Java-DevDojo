package maratonajava.javacore.ZZDoptional.repositorio;

import maratonajava.javacore.ZZDoptional.dominio.Book;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class BookRepository {
    private static List<Book> books = List.of(new Book(1, "Meditações", 12), new Book(2, "A arte da Guerra", 13));

    public static Optional<Book> findByTitle(String title) {
        return findBy(b -> b.getTitle().equals(title));
/*
        Book found = null;

        for (Book book : books) {
            if (book.getTitle().equals(title))
                found = book;
        }
        return Optional.ofNullable(found);
*/
    }

    public static Optional<Book> findByID(Integer id) {
        return findBy(b -> b.getId().equals(id));
/*
        Book found = null;

        for (Book book : books) {
            if (book.getId().equals(id))
                found = book;
        }
        return Optional.ofNullable(found);
*/
    }

    public static Optional<Book> findBy(Predicate<Book> predicate) {
        Book found = null;

        for (Book book : books) {
            if (predicate.test(book))
                found = book;
        }
        return Optional.ofNullable(found);
    }

}
