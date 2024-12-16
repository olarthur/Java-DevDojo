package maratonajava.javacore.introducaoclasses.test;

import maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Marco Aurélio";
        professor.idade = 21;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
