package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.dominio.Cliente;
import maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Homero", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("César", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Aristóteles", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Sêneca", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
