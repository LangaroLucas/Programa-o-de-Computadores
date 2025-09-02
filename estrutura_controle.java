public class estrutura_controle{
    public static void main(String[] args) {
      int opcao;
      String resultado;
      opcao = 5;

      switch(opcao){
        case 1:
            resultado = "Opção 1";
            break;
        case 2:
            resultado = "Opção 2";
            break;
        case 3:
            resultado = "Opção 3";
            break;
        case 4:
            resultado = "Opção 4";
            break;
        case 5:
            resultado = "Opção 5";
            break;
        default:
            resultado = "Opção Inválida";
            break;
        }
        System.out.println("Opção escolhida: " + resultado);


    }


}
