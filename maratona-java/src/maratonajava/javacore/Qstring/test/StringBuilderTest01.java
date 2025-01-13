package maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Marco";
        nome.concat("Aurélio");
        nome.substring(0, 2);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Marco Aurélio");
        sb.append(" Epicuro");
        sb.reverse(); // reverte a string
        sb.reverse();
        sb.delete(0, 2); // deleta os valores nas posicões indicadas de inicio e fim;
        System.out.println(sb);
    }
}
