package maratonajava.javacore.introducaoclasses.test;

import maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "Sport";
        carro1.ano = 2020;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 2017;

        System.out.println("--------Carro 1---------");
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("\n--------Carro 2---------");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
