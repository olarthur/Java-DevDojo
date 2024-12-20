package maratonajava.javacore.modificadorestatico.dominio;

public class Series {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Bloco de inicialização estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco de inicialização estatico 2");
    }

    static {
        System.out.println("Bloco de inicialização estatico 3");
    }

    {
        System.out.println("Bloco de inicialização não estatico.");
    }

    public Series(String nome){
        this.nome = nome;
    }

    public Series(){
        for (int episodio : Series.episodios){
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
