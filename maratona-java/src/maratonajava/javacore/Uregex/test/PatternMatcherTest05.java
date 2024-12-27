package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // use regexr.com to learn 
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "marcoaurelio@hotmail.com, 123epicteto@gmail.com, #@!seneca@mail.br, teste@gmail.com.br, zenao@mail";

        System.out.println("Email válido");
        System.out.println("#@!seneca@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }
    }
}
