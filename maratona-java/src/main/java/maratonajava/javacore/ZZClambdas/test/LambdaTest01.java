package maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Epicuro", "Epicteto", "Sêneca", "Zenão");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6,7,8, 9);
        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.print(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    /* anonimas, funções, concisa
    *  (parametro) -> <expressão>
    * (Car car) -> car.getColor().equals.("green");
    */
}
