import java.util.Scanner;

public class lista2_ex2 {
    public static void main(String[] args){

        //Escreva um programa que leia a matrícula de um funcionário, seu número de horas trabalhadas, 
        //o valor que recebe por hora trabalhada, a qual mês se referem as informações (ex: “Maio/24”) 
        //e calcule o salário desse funcionário no mês. Mostre a matrícula, o número de horas, o mês, 
        //o salário total do funcionário e se o funcionário teve horas extras no mês. 
        //A quantidade normal de horas são 200h.
        //O que exceder isso é considerado hora extra e deve ter um adicional no valor de 50%

        int matricula;
        double num_horas;
        double num_horas_extra = 0;
        double horas_normais = 200;
        double valor_horas;
        String mes;
        double salario;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe sua matrícula: ");
        matricula = s.nextInt();

        System.out.println("Quantas horas você trabalhou: ");
        num_horas = s.nextDouble();

        System.out.println("Informe o valor que recebe por hora: ");
        valor_horas = s.nextDouble();

        System.out.println("Informe o mês de referência(Ex: Maio/24): ");
        s.nextLine(); //Limpa o buffer para o usuário conseguir digitar na próxima linha
        mes = s.nextLine();


        //Se o funcionário trabalhou até 200 horas (ou menos), o salário é só: horas * valor por hora.
        //Se passou das 200 horas, o que passar é hora extra, que vale 50% a mais.
        //Passo 1: Veja se as horas são até 200.
        //Passo 2: Se sim, multiplica horas normais pelo valor da hora.
        //Passo 3: Se não, calcula quantas são extras.
        //Passo 4: Calcula o salário normal + salário extra.


        if (num_horas <= horas_normais) {
            // Se trabalhou 200 ou menos horas
            salario = num_horas * valor_horas;
        }else {
            // Se trabalhou mais que 200 horas
            num_horas_extra = num_horas - horas_normais; // calcula quantas horas extras
            // Salário = 200 horas normais + horas extras com adicional de 50%
            salario = (horas_normais * valor_horas) + (num_horas_extra * valor_horas * 1.5);
        }

        System.out.println("\n----- Folha de Pagamento -----");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas trabalhadas: " + num_horas);
        System.out.println("Mês de referência: " + mes);
        System.out.printf("Salário total: R$ %.2f\n", salario);

        if (num_horas_extra > 0){
            System.out.printf("Horas extras: %.2f (com adicional de 50%%)\n",num_horas_extra);
        }else{
            System.out.println("Não houve horas extras neste mês.");
        }

    }
}
