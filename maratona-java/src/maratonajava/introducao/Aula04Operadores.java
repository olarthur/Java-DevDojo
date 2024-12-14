package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Os operdaores aritméticos são '+' '-' '/' '*'.

        double number01 = 10;
        double number02 = 20;
        double soma = number01 + number02;
        double sub = number02 - number01;
        double multi = number01 * number02;
        double div = number02 / number01;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println();

        // Módulo '%' = resto da divisão

        int resto = 21 % 7;
        System.out.println(resto);
        System.out.println();

        // Operadores lógicos '<' '>' '<=' '>=' '==' '!='

        boolean isDezMaiorQVinte = 10 > 20;
        boolean isDezMenorQVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDifVinte = 10 != 20;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQVinte);
        System.out.println("Dez é  que vinte? " + isDezMenorQVinte);
        System.out.println("Dez é maior que vinte? " + isDezIgualVinte);
        System.out.println("Dez é maior que vinte? " + isDezDifVinte);

    }
}
