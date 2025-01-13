package maratonajava.javacore.Gassociacao.exercicio.test;

import maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Dez do Onze, 12");
        Aluno aluno = new Aluno("Epiteto", 27);
        Professor professor = new Professor("Musônio Rufo", "Estóico");

        Aluno[] alunosDoSeminario = {aluno};

        Seminario seminario = new Seminario("Princípios de Virtude", alunosDoSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
