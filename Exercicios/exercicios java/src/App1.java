import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();

        ret1.pergunta();
        ret1.printar();
        
        ret1.aumentAltura();
        ret1.printar();
        ret1.isquadrado();
        ret1.perimetro();
        

        input.close(); 
    }
}
