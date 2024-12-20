package maratonajava.javacore.sobrescrita.dominio;

public class Series {
    private String nome;

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Series(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
