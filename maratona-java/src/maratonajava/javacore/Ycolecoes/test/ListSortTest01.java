package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(6);
        books.add("Meditações");
        books.add("O Manual de Epicteto");
        books.add("A arte da guerra");
        books.add("Sobre a brevidade da vida");
        books.add("Retórica");

        Collections.sort(books); // reorganiza a lista de String em ordem alfabetica

        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();

        List<Double> moneys = new ArrayList<>();
        moneys.add(675.8);
        moneys.add(24.3);
        moneys.add(1442.3);
        moneys.add(232.52);
        moneys.add(51.9);

        System.out.println(moneys);

        Collections.sort(moneys); // reorganiza a lista numerica em ordem crescente

        System.out.println(moneys);
    }
}
