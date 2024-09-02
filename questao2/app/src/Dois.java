
 import java.util.Scanner;

 public class Dois {
     public static void main(String[] args) throws Exception {
         System.out.println("Hello, World!");
 
         Scanner input = new Scanner(System.in);
         String vogal;
         
         vogal = input.nextLine();
 
         System.out.println("Sua palavra: " + vogal);
         
         int contadorVogais = 0;
         for (int i = 0; i < vogal.length(); i++) {
             char c = Character.toLowerCase(vogal.charAt(i)); 
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                 contadorVogais++;
             }
         }
         System.out.println("A quantidad de vogais é igual a: " + contadorVogais);
     }
 }
 
 