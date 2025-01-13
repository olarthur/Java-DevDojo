package maratonajava.javacore.ZZEstreams.test;

/*
   1. Order LightNovel by title
   2. Retrieve the first 3 titles light novels with price less than 4
*/

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("The Beginning", 8.99),
            new LightNovel("The Lord of the Rings", 3.99),
            new LightNovel("Vagabond", 5.99),
            new LightNovel("O Alienista", 2.99),
            new LightNovel("Dom Casmurro", 5.99),
            new LightNovel("Hamlet", 1.99),
            new LightNovel("Otelo", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() == 3) {
                break;
            }
        }


        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
