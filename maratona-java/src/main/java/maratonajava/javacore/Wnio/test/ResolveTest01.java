package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/arthur");
        Path file = Paths.get("dev/file.txt");

        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/arthur");
        Path relative = Paths.get("dev");
        Path files = Paths.get("files.txt");

        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(files));
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(files));
        System.out.println("5 " + files.resolve(absolute));
        System.out.println("6 " + files.resolve(relative));


    }
}
