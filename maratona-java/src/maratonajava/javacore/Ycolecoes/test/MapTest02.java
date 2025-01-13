package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;
import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Bauman");
        Consumidor consumidor2 = new Consumidor("Zygmunt");

        Book book1 = new Book(5L, "Meditações", 37.90);
        Book book2 = new Book(1L, "O Manual de Epicteto", 34.90);
        Book book3 = new Book(4L, "A arte da guerra", 24.90);
        Book book4 = new Book(3L, "Sobre a brevidade da vida", 33.90);
        Book book5 = new Book(2L, "Retórica", 79.90);

        Map<Consumidor, Book> consumidorBook = new HashMap<>();

        consumidorBook.put(consumidor1, book1);
        consumidorBook.put(consumidor2, book3);

        for (Map.Entry<Consumidor, Book> entry : consumidorBook.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
