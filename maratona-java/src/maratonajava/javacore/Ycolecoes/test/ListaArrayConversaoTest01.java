package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArrays = numbers.toArray(numbers.toArray(new Integer[0]));
        System.out.println(Arrays.toString(listToArrays));
        System.out.println("----------------------");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> arraysToList = Arrays.asList(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arraysToList);

        System.out.println("----------------------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(13);
        System.out.println(numbersList);

        Arrays.asList("1", "2");
    }
}
