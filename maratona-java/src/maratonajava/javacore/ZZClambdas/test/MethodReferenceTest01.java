package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.dominio.Series;
import maratonajava.javacore.ZZClambdas.service.SeriesComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Series> seriesList = new ArrayList<>(List.of(new Series("Sopranos", 13), new Series("Ruptura", 10), new Series("Succession", 15)));

//        Collections.sort(seriesList, (s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        Collections.sort(seriesList, SeriesComparators::compareByTitle);
        seriesList.sort(SeriesComparators::compareByEpisodes);

        System.out.println(seriesList);
        System.out.println(seriesList);

    }
}
