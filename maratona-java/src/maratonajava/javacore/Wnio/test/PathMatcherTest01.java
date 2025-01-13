package maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("folder/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/*.{bkp,txt,java}"); //'**' descosidera os diretórios anteriores
        matches(path2, "glob:**/*.{bkp,txt,java}"); // '/*' procura um arquivo no diretório com qq nome
        matches(path3, "glob:**/*.{bkp,txt,java}"); // '.{}' procura um arquivo com os tipos indicados
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???"); // '???' indica que o arquivo deve conter 3 letras
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.????");

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
