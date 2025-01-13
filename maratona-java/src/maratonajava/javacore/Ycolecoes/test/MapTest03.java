package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;
import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Bauman");
        Consumidor consumidor2 = new Consumidor("Zygmunt");

        Book book1 = new Book(5L, "Meditações", 37.90);
        Book book2 = new Book(1L, "O Manual de Epicteto", 34.90);
        Book book3 = new Book(4L, "A arte da guerra", 24.90);
        Book book4 = new Book(3L, "Sobre a brevidade da vida", 33.90);
        Book book5 = new Book(2L, "Retórica", 79.90);

        List<Book> bookConsumidor1List = List.of(book1, book2, book5);
        List<Book> bookConsumidor2List = List.of(book2, book4);
        Map<Consumidor, List<Book>> consumidorBookMap = new HashMap<>();

        consumidorBookMap.put(consumidor1, bookConsumidor1List);
        consumidorBookMap.put(consumidor2, bookConsumidor2List);

        for (Map.Entry<Consumidor, List<Book>> entry : consumidorBookMap.entrySet()) {
            System.out.println("----" + entry.getKey().getName());

            for (Book book : entry.getValue()) {
                System.out.println("------" + book.getName());
            }

        }
    }
}
