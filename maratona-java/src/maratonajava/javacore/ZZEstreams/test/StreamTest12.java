package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Category;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);

        System.out.println(categoryLightNovelMap);

        System.out.println("------------------------------------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);
    }
}
