/*
    Como getente eu gostaria  que meus usuários pudessem digitar o tipo da conta e o sistem imrprima
    qual a porcentagem de juros que aquela conta irá oferecer. Com o intuito de  agilizar o acesso
    a informações. Os tipos de contas são:
            - CONTA_POUPANÇA = 0.05%;
            - CONTA_CORRENTE - O.02%
            - CONTA_INVESTIMENTO = 0.1%;
     Caso a conta não exista imprima: Conta inexistente)
 */
package academy.java.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de conta de 1 a 3 sendo: \n " +
                "1 - CONTA_POUPANÇA  \n" +
                " 2 - CONTA_CORRENTE  \n" +
                " 3 - CONTA_INVESTIMENTO");
        int opcaoConta = input.nextInt();
        String opcao;

        switch (opcaoConta){
            case 1:
                opcao = "CONTA_POUPANÇA = 0.05%";
                break;
            case 2:
                opcao = "CONTA_CORRENTE = O.02%";
                break;
            case 3:
                opcao = "CONTA_INVESTIMENTO = 0.1%";
                break;
            default:
                opcao = "Tipo de conta inexistente";
                break;
        }
        System.out.println("A opção digitada é: " + opcao);
    }
}
