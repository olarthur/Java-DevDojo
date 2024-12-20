package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(100, 4);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 0));
        System.out.println("-----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(100, 0);
    }
}
