package maratonajava.javacore.Zgenerics.dominio;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
