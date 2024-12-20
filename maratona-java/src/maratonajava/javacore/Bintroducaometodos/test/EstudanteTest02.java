package maratonajava.javacore.introducaometodos.test;

import maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marco Aurélio";
        estudante01.idade = 32;
        estudante01.sexo = 'M';

        estudante02.nome = "Sêneca";
        estudante02.idade = 34;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
