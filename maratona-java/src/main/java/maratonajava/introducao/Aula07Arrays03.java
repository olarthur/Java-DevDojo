package maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[] {1, 2, 3};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i);
        }

        for(int i : numeros) {
            System.out.println(i);
        }
    }
}
