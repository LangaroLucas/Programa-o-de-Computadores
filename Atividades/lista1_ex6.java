import java.util.Scanner;

public class lista1_ex6 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num = s.nextInt();

        System.out.println("Número informado: " + num);
        System.out.println("Num elevado a 2: " + Math.pow(num, 2));
        System.out.println("Num elevado a 4: " + Math.pow(num, 4));
        System.out.println("Num elevado a 6: " + Math.pow(num, 6));
        System.out.println("Num elevado a 8: " + Math.pow(num, 8));
        System.out.println("Num elevado a 10: " + Math.pow(num, 10));
    }
}
