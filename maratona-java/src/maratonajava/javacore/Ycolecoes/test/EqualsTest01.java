package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smatphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smatphone s1 = new Smatphone("010290", "Samsung");
        Smatphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
