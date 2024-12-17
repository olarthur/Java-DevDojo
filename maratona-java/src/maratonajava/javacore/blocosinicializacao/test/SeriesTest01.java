package maratonajava.javacore.blocosinicializacao.test;

import maratonajava.javacore.blocosinicializacao.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args){
        Series series = new Series("Ruptura");
//      Series series = new Series();

        for (int episodio : series.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
