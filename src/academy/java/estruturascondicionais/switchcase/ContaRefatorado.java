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

public class ContaRefatorado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de conta:");

        String opcaoConta = input.next().toUpperCase();
        String opcao;

        switch (opcaoConta){
            case "CONTA_POUPANCA" :
                opcao = "0.05%";
                break;
            case "CONTA_CORRENTE":
                opcao = "O.02%";
                break;
            case "CONTA_INVESTIMENTO":
                opcao = "0.1%";
                break;
            default:
                opcao = "Tipo de conta inexistente";
                break;
        }
        System.out.println(opcao);
    }
}
