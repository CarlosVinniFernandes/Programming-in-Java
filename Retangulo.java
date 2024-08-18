import java.util.Scanner;

public class Retangulo {
    Scanner input = new Scanner(System.in);

    double base = 5.5;
    double altura = 5.5;
    double perimetro = 2*(base + altura);
    double area = base*altura;
    
    void pergunta(){
        while(true){
        System.out.println("Digite um numero para a Base do Retangulo:");
        base = input.nextDouble();
        System.out.println("Digite um numero para a Altura do Retangulo:");
        altura = input.nextDouble();
        if (base > 0 && altura > 0){
            break;            
            }

        else{
            System.out.println("Digite um número positivo!");
            }
        }
        input.close();

    }

    void aumentAltura(){
        altura += 1;
    }

    void aumentBase(){
        base += 1;
    }

    void decAltura(){
        altura -= 1;
    }

    void decBase(){
        base -= 1;
    }

    void printar(){
        System.out.println("Base: "+ base+"\nAltura: "+altura);
    }
    
    void perimetro(){
        System.out.println("O perímetro do retângulo é igual a: "+perimetro);
    }
    void area(){
        System.out.println("A área do retângulo é igual a: "+ area);
    }

    void isquadrado(){
        if(base == altura){
            System.out.println("É quadrado!");
        }
        else{
            System.out.println("Não é quadrado");
        }
    }

}
