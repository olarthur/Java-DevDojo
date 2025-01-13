package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/arthur");
        Path clazz = Paths.get("/home/arthur/seneca/OlaMundo.java");

        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/arthur");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/home/arthur/seneca/OlaMundo.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.0101010");

        System.out.println("1 " + absolute1.relativize(absolute3)); // 1 seneca\OlaMundo.java
        System.out.println("2 " + absolute3.relativize(absolute1)); // 2 ..\..
        System.out.println("3 " + absolute1.relativize(absolute2)); // 3 ..\..'\'user\local
        System.out.println("4 " + relative1.relativize(relative2)); // 4 temp.0101010
        System.out.println("5 " + absolute1.relativize(relative1)); // IllegalArgumentException
    }
}
