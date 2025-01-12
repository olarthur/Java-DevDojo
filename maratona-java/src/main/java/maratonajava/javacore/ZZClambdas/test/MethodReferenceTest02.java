package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.dominio.Series;
import maratonajava.javacore.ZZClambdas.service.SeriesComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        SeriesComparators seriesComparators = new SeriesComparators();

        List<Series> seriesList = new ArrayList<>(List.of(new Series("Sopranos", 13), new Series("Ruptura", 10), new Series("Succession", 15)));

        seriesList.sort(seriesComparators::compareByEpisodesNonStatic);
        seriesList.sort((s1,s2) -> seriesComparators.compareByEpisodesNonStatic(s1,s2));
        System.out.println(seriesList);
    }
}
