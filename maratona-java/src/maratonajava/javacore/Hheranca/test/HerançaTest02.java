package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerançaTest02 {
    public static void main(String[] args) {
        // Ordem dos blocos de inicialização
        /*
        * 0- Bloco de inicializção estático da superclasse é executado quando a JVM carregar
        * 1- Bloco de inicialização estático da subclasse é executado
        * 2- Alocado espaço em memória para o objeto da superclasse
        * 3- Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
        * 4- Bloco de inicialização da superclasse é executado na ordem que aparece
        * 5- Construtor da superclasse é executado
        * 6- Alocado espaço em memória para o objeto da subclasse
        * 7- Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
        * 8- Bloco de inicialização da subclasse é executado na ordem em que aparece
        * 9- Construtor da subclasse é executado
        * */
        Funcionario funcionario = new Funcionario("Marco Aurélio");
    }
}
