package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> fusca = criarArrayComUmObjeto(new Carro("Fusca"));
        System.out.println(fusca);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

    /*
    * private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
    *      return List.of(t);
    * }
    * */

}
