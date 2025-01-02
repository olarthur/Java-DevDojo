package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("folder criada? "+isDirectoryCreated);

//        File fileArquivoDirectory = new File("C:\\Users\\Arthur\\OneDrive\\Documentos\\estudos-java\\Java-DevDojo\\folder\\arquivo.txt");
        File fileArquivoDirectory = new File(fileDirectory, "arquivo.txt");
        boolean isFileCreated = fileArquivoDirectory.createNewFile();
        System.out.println("arquivo.txt criado? "+isFileCreated);

        File fileRenamed = new File(fileDirectory, "arquivo_renamed.txt");
        boolean isFileRenamed = fileArquivoDirectory.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado para arquivo_renamed.txt? "+isFileRenamed);

        File directoryRenamed = new File("folder_renamed");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("folder renomeada para folder_renamed? "+isDirectoryRenamed);
    }
}
