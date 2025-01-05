package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);
    }
}
