package maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        long number = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 20;
        short ageShort = 21;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Arthur";

        System.out.println(nome);
        System.out.println("A idade é: " + age + " anos.");
        System.out.println("O número é: " + number);
        System.out.println("O sálario é: " + salaryDouble);
        System.out.println("O sálario é: " + salaryFloat);
        System.out.println("A idade é: " + ageByte);
        System.out.println("A idade é: " + ageShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);

    }
}
