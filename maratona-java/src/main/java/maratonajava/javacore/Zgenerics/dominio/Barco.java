package maratonajava.javacore.Zgenerics.dominio;

public class Barco {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }
}
