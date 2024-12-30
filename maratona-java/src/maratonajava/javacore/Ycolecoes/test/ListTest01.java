package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList(16);
        List<String> names2 = new ArrayList(16);
        names1.add("Sun Tzu");
        names1.add("China");

        names2.add("Lao Tzu");
        names2.add("Academy");

//        names.remove("Sun Tzu"); remove do ArrayList
        names1.addAll(names2); // adiciona os valores de name2 à names1

        for (String name : names1) {
            System.out.println(name);
        }

        names1.add("Confúcio");

        System.out.println("---------------");

        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}
