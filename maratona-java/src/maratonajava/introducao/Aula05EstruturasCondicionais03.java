package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador Ternário   variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;

        double salario = 6000;
        String msnDoar = "Doar 5 reais";
        String msnNaoDoar = "Não doar";

        String resultado = salario > 5000 ? msnDoar : msnNaoDoar;
        
        System.out.println(resultado);
    }
}
