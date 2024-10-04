public class Recursao {

    public static int fatorial(int n) {

        if (n == 0) {
            return 1; 
        }
        
        // Passo 2: Chamada recursiva
        return n * fatorial(n - 1); 
    }

    public static void main(String[] args) {
        int n = 5; 
        int resultado = fatorial(n); 

        System.out.println(resultado);
    }
}
