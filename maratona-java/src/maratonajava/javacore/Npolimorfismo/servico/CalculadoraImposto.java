package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }



    /*
    *    public static void calcularImpostoComputador(Computador computador){
    *    System.out.println("Relatório de Imposto do Computador");
    *    double imposto = computador.calcularImposto();
    *
    *    System.out.println("Computador: " + computador.getNome());
    *    System.out.println("Valor: " + computador.getValor());
    *    System.out.println("Imposto a ser pago: " + imposto);
    *    }
    *
    *    public static void calcularImpostoTomate(Tomate tomate){
    *    System.out.println("Relatório de Imposto do Tomate");
    *    double imposto = tomate.calcularImposto();
    *
    *    System.out.println("Tomate: " + tomate.getNome());
    *    System.out.println("Valor: " + tomate.getValor());
    *    System.out.println("Imposto a ser pago: " + imposto);
    *   }
    * */
}
