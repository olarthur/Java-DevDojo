package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Category;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));

        System.out.println(collect);

        // Map<Category, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));

        System.out.println(collect1);
    }
}
