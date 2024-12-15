package maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[4][];

        int[] array = {1,6,8,90,234,324};

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,2,3,5,6,7};
        arrayInt[2] = new int[4];
        arrayInt[3] = array;
    

        for (int[] arrayBase : arrayInt){
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
