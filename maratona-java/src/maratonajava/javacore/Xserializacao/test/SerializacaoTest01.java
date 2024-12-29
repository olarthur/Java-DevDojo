package maratonajava.javacore.Xserializacao.test;

import maratonajava.javacore.Xserializacao.dominio.Aluno;
import maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Marco Aurélios", "0101000101001");
        Turma turma = new Turma("Império Romano");

        aluno1.setTurma(turma);
        serializar(aluno1);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar() {
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
