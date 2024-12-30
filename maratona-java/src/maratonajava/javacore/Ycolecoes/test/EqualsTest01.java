package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("010290", "Samsung");
        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
