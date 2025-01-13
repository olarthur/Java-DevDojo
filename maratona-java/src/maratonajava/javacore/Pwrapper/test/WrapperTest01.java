package maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char cahrP = 'E';
        boolean booleanP = false;

        Byte byteA = 1;
        Short shortA = 1;
        Integer intA = 1; // autoboxing
        Long longA = 10L;
        Float floatA = 10F;
        Double doubleA = 100.0;
        Character cahrA = 'E';
        Boolean booleanA = false;

        int i = intA; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('E'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('E'));
    }
}
