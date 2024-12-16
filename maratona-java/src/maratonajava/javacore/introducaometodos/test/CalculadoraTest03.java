package maratonajava.javacore.introducaometodos.test;

import maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(100, 4);
        System.out.println(result);
    }
}
