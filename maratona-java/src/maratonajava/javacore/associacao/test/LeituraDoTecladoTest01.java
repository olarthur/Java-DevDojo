package maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Digite 'M' ou 'F' para informar seu sexo: ");
        char sexo = leia.next().charAt(0);
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo);
    }
}
