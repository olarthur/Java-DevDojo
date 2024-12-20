package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.dominio.Cliente;
import maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Homero", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("César", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
