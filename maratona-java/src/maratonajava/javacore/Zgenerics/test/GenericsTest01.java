package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Hamlet");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumidor("Epicuro"));

        for (String o : lista) {
            System.out.println(o);
        }
    }

    public static void add(List list, Consumidor consumidor) {
        list.add(consumidor);
    }
}
