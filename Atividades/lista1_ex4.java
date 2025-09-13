import java.util.Scanner;

public class lista1_ex4 {
    
    public static void main(String[] args) {
        /*Faça um programa que peça dois números inteiros ao usuário.
         * Depois exiba se o primeiro é maior, menor ou igual ao segundo.
         */

         int num1, num2;
         Scanner s = new Scanner(System.in);
         String resultado = "Número são iguais!";

         System.out.print("Informe o primeiro número: ");
         num1 = s.nextInt();
         System.out.print("Informe o segundo número: ");
         num2 = s.nextInt();

        if(num1 > num2){ //Expressão com resultado lógico.
            //quando resultado for verdadeiro
            resultado = "Num1 é maior que num2!";
        }else if ( num1 < num2 ) {
            //quando resultado for verdadeiro
            resultado = "Num1 é menor que num2!";
        }else {
            //quando resultado for falso
            resultado = "Números são iguais!";
        }
        System.out.println("Resultado: " + resultado);

    }
}
