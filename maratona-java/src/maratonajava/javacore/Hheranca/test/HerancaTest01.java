package maratonajava.javacore.heranca.test;

import maratonajava.javacore.heranca.dominio.Endereco;
import maratonajava.javacore.heranca.dominio.Funcionario;
import maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Um do Dois, 3");
        endereco.setCep("08888-880");

        Pessoa pessoa = new Pessoa("Sêneca");
        pessoa.setCpf("088.888.888-80");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Epiteto");
        funcionario.setCpf("088.888.888-80");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        funcionario.imprime();
    }
}
