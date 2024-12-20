package maratonajava.javacore.sobrecargametodos.test;

import maratonajava.javacore.sobrecargametodos.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args){
        Series series = new Series();
        series.init("Sopranos", "Crime", 13);
        series.imprime();
    }
}
