package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Category;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("The Beginning", 8.99, Category.FANTASY),
            new LightNovel("The Lord of the Rings", 3.99, Category.FANTASY),
            new LightNovel("Vagabond", 5.99, Category.DRAMA),
            new LightNovel("O Alienista", 2.99, Category.ROMANCE),
            new LightNovel("Dom Casmurro", 5.99, Category.ROMANCE),
            new LightNovel("Hamlet", 1.99, Category.DRAMA),
            new LightNovel("Hamlet", 1.99, Category.DRAMA),
            new LightNovel("Otelo", 4.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect3);
    }
}
