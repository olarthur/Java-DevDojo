package main.java.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {

        int[][] arrayInt = {{0,0}, {1,2,2,3,5,6,7}, {0,0,0,0}, {1,6,8,90,234,324}};

        for (int[] arrayBase : arrayInt){
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
