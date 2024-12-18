package maratonajava.javacore.associacao.test;

import maratonajava.javacore.associacao.dominio.Escola;
import maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor1 = new Professor("Epiteto");
        Professor professor2 = new Professor("Sêneca");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Estóica", professores);

        escola.imprime();
    }
}
