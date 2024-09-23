import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("teste");
        String s1 = "TEste";
        String s2 = "TEstesss";
        // String s3 = s1 - s2;

        System.out.println(s1.compareTo(s2));

        System.out.println(123 * 100 + 45);
        System.out.println("123" + 45);
        System.out.println(12 + "345");

        int i=3,j=4; double y=2.54;

        double x = (double) i / j;
        System.out.println(x);  

        int n = 13;
System.out.print(doNothing(n));
System.out.print(" " + n);

    }

    public static double doNothing(int n) {
        n = n + 8;
        return (double) 12 / n;
    }
}
