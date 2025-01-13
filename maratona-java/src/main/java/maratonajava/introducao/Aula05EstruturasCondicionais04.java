package maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 33000;
        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double valorImposto = 0;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * firstTax;
        } else if (salarioAnual > 34713 && salarioAnual <= 68500) {
            valorImposto = salarioAnual * secondTax;
        } else {
            valorImposto = salarioAnual * thirdTax;
        }

        System.out.println(valorImposto);
    }
}
