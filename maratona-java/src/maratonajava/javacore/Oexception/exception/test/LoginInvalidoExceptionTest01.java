package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner leia = new Scanner(System.in);

        String usernameDB = "Zenão";
        String senhaDB = "Epicuro";

        System.out.println("Usuário");
        String usuarioDigitado = leia.nextLine();
        System.out.println("Senha");
        String senhaDigitada = leia.nextLine();

        if (!usernameDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
