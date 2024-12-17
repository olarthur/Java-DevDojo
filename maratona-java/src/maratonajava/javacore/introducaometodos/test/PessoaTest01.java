package maratonajava.javacore.introducaometodos.test;

import maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Epiteto");
        pessoa.setIdade(34);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
       // pessoa.imprime();
    }
}
