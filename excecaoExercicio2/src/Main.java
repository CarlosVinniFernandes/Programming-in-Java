import excecoes.SenhaNaoEhQuatroDigitos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaNaoEhQuatroDigitos e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) throws SenhaNaoEhQuatroDigitos {
        if (senha.length() != 4) {
            throw new SenhaNaoEhQuatroDigitos("Coloque apenas quatro dígitos!");
        }
    }
}
