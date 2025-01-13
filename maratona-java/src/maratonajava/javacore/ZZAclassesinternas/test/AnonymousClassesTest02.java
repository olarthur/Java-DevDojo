package maratonajava.javacore.ZZAclassesinternas.test;

import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Carro> carrosList = new ArrayList<>(List.of(new Carro("Gol"), new Carro("Palio")));
//        carrosList.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); Lambda

        carrosList.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(carrosList);
    }
}
