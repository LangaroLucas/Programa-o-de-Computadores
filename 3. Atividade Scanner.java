import java.util.Scanner;

class AtividadeScanner {
    
    public static void main(String[] args){
    
       //Criar variáveis para cada tipo primitivo, peça ao usuário os valores, armazene nas variáveis
        //mostre na tela os valores informados pelo usuário:
        int ex_inteiro;
        char ex_char;

        //Criar o scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        ex_inteiro = s.nextInt();
        System.out.println("Valor informado: " + ex_inteiro);

        System.out.print("Informe uma letra: ");
        ex_char = s.next().charAt(0); //0 Significa a posição da letra informada L U C A S - 0 1 2 3 4 //Nesse exemplo vai aparecer a letra L
        System.out.println("Letra informada: " + ex_char);
    }
}
