package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sêneca", 14000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marco Aurélio", 8000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
