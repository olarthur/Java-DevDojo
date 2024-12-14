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

        // Operadores relacionais '<' '>' '<=' '>=' '==' '!='

        boolean isDezMaiorQVinte = 10 > 20;
        boolean isDezMenorQVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDifVinte = 10 != 20;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQVinte);
        System.out.println("Dez é menor que vinte? " + isDezMenorQVinte);
        System.out.println("Dez é igual que vinte? " + isDezIgualVinte);
        System.out.println("Dez é diferente de vinte? " + isDezDifVinte);
        System.out.println();

        // Operadores lógicos '&&' = AND , '||' = OR , '^' = XOR , '!' = Negação

        int x, y, z;
        boolean r;

        x = 4;
        y = 7;
        z = 12;

        r = (x < y && y < z) ? true : false;
        r = (x < y && y == z) ? true : false;
        r = (x < y || y == z) ? true : false;
        r = (x == y || y > z) ? true : false;
        r = (x < y ^ y == z) ? true : false;
        r = (x < y ^ y < z) ? true : false;
        System.out.println(r);
        System.out.println();

        // Operadores de atribuição '=' '+=' '-=' '*=' '/=' '%='

        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2
        System.out.println(bonus);

        // '++' '--'
        int contador = 0;
        contador ++;
        contador --;
        System.out.println(contador);
    }
}
