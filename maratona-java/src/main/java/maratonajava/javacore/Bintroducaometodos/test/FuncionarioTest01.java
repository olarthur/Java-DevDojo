package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Platão");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1600, 1800.78, 2500});

        funcionario.imprimirDados();
    }
}
