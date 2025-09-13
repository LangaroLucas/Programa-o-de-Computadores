import java.util.Scanner;

public class lista1_ex5 {
    public static void main(String[] args) {
        //

        int num;
        Scanner s = new Scanner(System.in);
        String resultado = "Número PAR";
    
        System.out.print("Informe o primeiro número: ");
        num = s.nextInt();

        System.out.println("\nExemplo Professor: ");
        if (num % 2 != 0) {
            resultado = "Número IMPAR!";
        }
        System.out.println("Resultado: " + resultado);

        
        System.out.println("\nExemplo Gaybriel: ");
        if (num % 2 == 0){
            System.out.println("Número PAR");
        }else{
            System.out.println("Número IMPAR");
        }
    }
}
