package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDiretory = "home/arthur/dev";
        String fileTxt = "../../file.txt";
        Path path1 = Paths.get(projectDiretory, fileTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./arthur/./dev/");

        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
