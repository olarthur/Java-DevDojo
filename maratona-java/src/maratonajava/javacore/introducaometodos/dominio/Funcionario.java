package maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salarios: ");

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.print("R$ " + salario + " ");
        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia Salárial: " + media);
    }
}
