package maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Brasil' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);

        System.out.println(sdf.format(new Date()));
        System.out.println();
        System.out.println(sdf2.format(new Date()));
        System.out.println();

        try {
            System.out.println(sdf2.parse("Brasil 24 de dezembro de 2024"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
