package maratonajava.javacore.blocosinicializacao.dominio;

public class Series {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Series(String nome){
        this.nome = nome;
    }

    public Series(){
        for (int episodio : this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
