package maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "     Epicteto    ";
        String numeros = "012345";
        System.out.println(nome.charAt(3)); // retorna o valor char no indice
        System.out.println(nome.length()); // retorna o tamanho do "array" de string
        System.out.println(nome.replace("o", "O")); // troca um valor por outro
        System.out.println(nome.toLowerCase()); // torna o valor da String em caracteres minúsculos
        System.out.println(nome.toUpperCase()); // torna o valor da String em caracteres maiúsculos

        System.out.println(numeros.length());
        System.out.println(numeros.substring(3, numeros.length())); // retorna o valor do indice indicado até o final da String
        System.out.println(nome.trim()); // remove os espaços no inicio e no final da String
    }
}
