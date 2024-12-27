package maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Homero, Alighieri, Virgílio, true, 300";
        String[] nomes = texto.split(",");

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
