import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double maior = 0.0;
        double menor = 1000.0;
        double media = 0.0;

        System.out.println("Qual o numero de participantes?");
        int participantes = sc.nextInt();
        double altura[] = new double[participantes];
        String sexo[] = new String[participantes];

        for(int i = 0 ; i < participantes; i++){
            System.out.println("Digite a altura do " + (i+1) + " participante: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Digite o sexo do " + (i+1) + " participante(M ou F): ");
            sexo[i] = sc.nextLine();
        }

        for(int i = 0; i < participantes; i++){
            if(altura[i] > maior){
                maior = altura[i];
            }
            else{
                continue;
            }
        }

        for(int i = 0; i < participantes; i++){
            if(altura[i] < menor){
                menor = altura[i];
            }
            else{
                continue;
            }
        }

        int contadorHomem = 0;
        int contadorMulher = 0;
        for(int i = 0; i < participantes; i++){
            if(sexo[i].toUpperCase().charAt(0) == 'F'){
                media += altura[i];
                contadorMulher ++;
            }
            else if(sexo[i].toUpperCase().charAt(0) == 'M'){
                contadorHomem ++;
            }
        }

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("A média da altura de mulheres é igual a: %.2f\n", (media/contadorMulher));
        System.out.println("A quantidade de homens é igual a: " + contadorHomem);


    }
}
