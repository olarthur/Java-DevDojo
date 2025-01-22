package maratonajava.javacore.ZZKjunit.dominio;

import java.util.Objects;

public record Book(String name, int chapters) {

    public Book {
        Objects.requireNonNull(name);
    }
}
