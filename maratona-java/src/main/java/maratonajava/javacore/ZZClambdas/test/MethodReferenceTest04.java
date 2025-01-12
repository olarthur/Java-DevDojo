package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.dominio.Series;
import maratonajava.javacore.ZZClambdas.service.SeriesComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        SeriesComparators seriesComparators = new SeriesComparators();
        Supplier<SeriesComparators> newSeriesComparator = SeriesComparators::new;
        SeriesComparators seriesComparators = newSeriesComparator.get();

        List<Series> seriesList = new ArrayList<>(List.of(new Series("Sopranos", 13), new Series("Ruptura", 10), new Series("Succession", 15)));

        seriesList.sort(seriesComparators::compareByEpisodesNonStatic);
        System.out.println(seriesList);

        BiFunction<String, Integer, Series> seriesBiFunction = (title, episodes) -> new Series(title, episodes);
        BiFunction<String, Integer, Series> seriesBiFunction2 = Series::new;

        System.out.println(seriesBiFunction2.apply("Prison Break", 22));
    }
}
