package maratonajava.javacore.construtores.dominio;

public class Series {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String streaming;

    public Series(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }


    public Series(String nome, String tipo, int episodios, String genero, String streaming) {
        this(nome, tipo, episodios, genero);
        this.streaming = streaming;
    }

    public Series(){
        System.out.println("Construtor sem argumentos.");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.streaming);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setStreaming(String streaming){
        this.streaming = streaming;
    }

    public String getStreaming(){
        return this.streaming;
    }
}
