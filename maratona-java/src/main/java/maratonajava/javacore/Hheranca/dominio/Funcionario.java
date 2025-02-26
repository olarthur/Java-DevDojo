package maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Bloco de inicialização de Funcionário 1");
    }
    {
        System.out.println("Bloco de inicialização de Funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor de Funconário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Foi " + this.nome + "recebido um salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
