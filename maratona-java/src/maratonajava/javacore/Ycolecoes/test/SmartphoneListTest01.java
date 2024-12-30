package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("010290", "Samsung");
        Smartphone s2 = new Smartphone("020300", "IPhone");
        Smartphone s3 = new Smartphone("030401", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // coloca s3 na primeira posição do array

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("030401", "Pixel");

        System.out.println(smartphones.contains(s4)); // utiliza o metodo equals para verificar se ja existe no array
        int indexSmartphone4 = smartphones.indexOf(s4); // retorna o indice do obj no array

        System.out.println(smartphones.get(indexSmartphone4));
    }
}
