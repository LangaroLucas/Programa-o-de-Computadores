import java.util.Scanner;

public class lista1_ex7 {
    public static void main(String[] args) {
        
        int num1, num2;
         Scanner s = new Scanner(System.in);
         String resultado = "Número são iguais!";

         System.out.print("Informe o primeiro número: ");
         num1 = s.nextInt();
         System.out.print("Informe o segundo número: ");
         num2 = s.nextInt();

         System.out.println("Resultado das comparações entre os números informados: ");
         System.out.println("num1 > num2: " + (num1 > num2));
         System.out.println("num1 < num2: " + (num1 < num2));
         System.out.println("num1 == num2: " + (num1 == num2));
         System.out.println("num1 != num2: " + (num1 != num2));

        String resposta;
        if (num1 > num2){
            resposta = "Verdadeiro";

        }else{
            resposta = "Falso";
        }
        System.out.println("Resposta é: " + resposta);
    }   
}
