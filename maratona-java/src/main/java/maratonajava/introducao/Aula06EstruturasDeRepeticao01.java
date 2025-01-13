package main.java.maratonajava.introducao;

import java.util.Arrays;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // 'while' , 'do while' , 'for'
        int count = 0;

        while(count < 11) {
            System.out.println(count);
            count++;
        }

        System.out.println();

        do {
            System.out.println(++count);
        } while(count < 20);

        System.out.println();

        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

    }
}
