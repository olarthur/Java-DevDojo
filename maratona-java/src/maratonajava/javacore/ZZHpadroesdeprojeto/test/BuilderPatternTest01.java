package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
//        new Person("Zygmunt", "Bauman", "Z.Bauman", "bauman.zygmunt@society.academy");
        Person build = new Person.PersonBuilder()
                .firstName("Zygmunt")
                .lastName("Bauman")
                .userName("Z.Bauman")
                .email("bauman.zygmunt@society.academy")
                .build();

        System.out.println(build);
    }
}
