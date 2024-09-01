/*
       Como usuário gostaria de ter um menu visual que seja navegável através de números.
       O menu deve ser exibido da seguinte forma:
            1 -  Calcular imposto
            2 -  Depositar salário
            3 -  Sair
      O menu deve ficar disponivel enquatno eu não digitar o número 3.
      Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
 */

package academy.java.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma das opções do menu: ");
        int opcaoUsuario = 0;
        int c = 3;

            while (opcaoUsuario != c ){
                System.out.println("1 - Calcular imposto");
                System.out.println("2 - Depositar salário");
                System.out.println("3 - Sair");
                opcaoUsuario = input.nextInt();
            }
        System.out.println("Você digitou a opção: 3 - Sair. O programa será encerrado. Bye ^_^");
    }
}
