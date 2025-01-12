package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // RuntimeException não pricisam necessariamente serem tratadas
        divisao(1,0);

        System.out.println("Código Finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
