package maratonajava.javacore.construtores.test;

import maratonajava.javacore.construtores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args){
        Series series = new Series("Sopranos", "Crime", 13, "Ação");
        Series series2 = new Series();

        series2.imprime();
        series.imprime();
    }
}
