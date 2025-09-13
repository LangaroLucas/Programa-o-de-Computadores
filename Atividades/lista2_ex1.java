import java.util.Scanner;

public class lista2_ex1 {

 

    public static void main(String[] args){
        
        double R, volume;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor do radio: ");
        R = s.nextDouble();

        volume = 4.0 / 3.0 * Math.PI * Math.pow(R, 3);

        //Exemplo sem formatação:
        System.out.println("Volume da esfera informada: " + volume);

        //Exemplo formatado:
        System.out.printf("O Volume da esfera informada: %.2f%n", volume);

    }
}