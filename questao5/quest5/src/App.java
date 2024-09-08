/*5 -  Escreva um programa em Java que calcule a média dos N primeiros números naturais, onde N é fornecido pelo usuário.

Requisitos:

O programa deve solicitar ao usuário que insira um número inteiro positivo N.
O programa deve calcular a soma dos primeiros N números naturais e depois calcular a média.
O resultado da média deve ser exibido na tela.


6c - Escreva um programa em Java que conte o número de palavras em uma string fornecida pelo usuário. Assuma que as palavras são separadas por espaços.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero inteiro positivo: ");
        int n = input.nextInt();

        int soma = 0;

        for(int i = 0; i < n; i++){
            soma += i;
            
        }
        double media = soma/n;
        System.out.println("A soma de inteiros até " + n + " é igual a: " + soma + "\nE a média é igual a: " + media);

    }
}
