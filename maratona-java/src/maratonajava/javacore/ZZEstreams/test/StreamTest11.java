package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("The Beginning", 8.99),
            new LightNovel("The Lord of the Rings", 3.99),
            new LightNovel("Vagabond", 5.99),
            new LightNovel("O Alienista", 2.99),
            new LightNovel("Dom Casmurro", 5.99),
            new LightNovel("Hamlet", 1.99),
            new LightNovel("Hamlet", 1.99),
            new LightNovel("Otelo", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());

        System.out.println(lightNovels.stream().
                collect(Collectors.counting()));

        System.out.println("--------------------");

        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println("--------------------");

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());

        System.out.println(lightNovels.stream()
                .collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println("--------------------");

        lightNovels.stream().
                mapToDouble(LightNovel::getPrice)
                .average().
                ifPresent(System.out::println);

        System.out.println(lightNovels.stream()
                .collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println("--------------------");

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("\n" + titles);
    }
}
