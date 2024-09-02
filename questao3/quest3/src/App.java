/*3 - Inversão de String
Escreva um programa em Java que inverta a ordem dos caracteres em uma string fornecida pelo usuário.
Requisitos:
O programa deve solicitar ao usuário que insira uma string.
O programa deve usar um loop para inverter a ordem dos caracteres na string.
O programa deve exibir a string invertida.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);
        String palavra;
        
        System.out.println("Digite uma palavra: ");
        palavra = input.nextLine();

         for (int i = palavra.length() - 1; i >= 0; i--) {
             char c = palavra.charAt(i);
             System.out.println(c); 
         }
    }
}
