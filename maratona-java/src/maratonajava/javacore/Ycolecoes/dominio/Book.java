package maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private Long id;
    private String name;
    private double price;
    private int amount;

    public Book(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(name, "Nome não pode ser null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Book(Long id, String name, double price, int amount) {
        this(id, name, price);
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(id, book.id) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantidade=" + amount +
                '}';
    }

    @Override
    public int compareTo(Book anotherBook) {
        /*
         negativo se this < anotherBook
         se this == anotherBook, return 0
         positivo se this > anotherBook

        organiza por id
        if (this.id < anotherBook.getId()) {
            return -1;
        }else if (this.id.equals(anotherBook.getId())) {
            return 0;
        } else {
            return 1;
        }
        return this.id.compareTo(anotherBook.getId());

        organiza por preco
        return this.Double.compare(price, anotherBook.getPrice());
        return this.Double.valueOf(price).compareTo(anotherBook.getPrice());
        */

        return this.name.compareTo(anotherBook.getName()); // organiza por nome
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
