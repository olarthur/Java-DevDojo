package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Book;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Book> booksQueue = new PriorityQueue<>(new BookPriceComparator().reversed());

        booksQueue.add(new Book(5L, "Meditações", 37.90, 0));
        booksQueue.add(new Book(1L, "O Manual de Epicteto", 34.90, 5));
        booksQueue.add(new Book(4L, "A arte da guerra", 24.90, 0));
        booksQueue.add(new Book(3L, "Sobre a brevidade da vida", 33.90, 2));
        booksQueue.add(new Book(2L, "Retórica", 79.90, 0));

        while(!booksQueue.isEmpty()) {
            System.out.println(booksQueue.poll());
        }
    }
}
