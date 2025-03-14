package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Sêneca"; // String constant pool
        String nome2 = "Sêneca";

        nome = nome.concat(" Epicuro"); // nome += " Epicuro"

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Sêneca"); // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
