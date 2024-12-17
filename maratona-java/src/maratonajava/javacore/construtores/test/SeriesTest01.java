package maratonajava.javacore.construtores.test;

import maratonajava.javacore.construtores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args){
        Series series = new Series("Sopranos", "Crime", 13, "Ação", "HBO");

        series.imprime();
    }
}
