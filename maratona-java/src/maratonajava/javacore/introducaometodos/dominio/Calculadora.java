package maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println("A multiplicação dos dois números é: " + num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
}
