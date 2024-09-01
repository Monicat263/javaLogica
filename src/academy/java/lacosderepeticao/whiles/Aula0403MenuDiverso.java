/*
  Elabore um programa em Java que simule um menu simples com quatro opções:

    Calcular a soma de dois números.
    Calcular o quadrado de um número.
    Mostrar a tabuada de um número (de 1 a 10).
    Sair do programa.
        O menu deve ser exibido repetidamente até que o usuário escolha a opção de sair (opção 4).
        O programa deve usar um laço while para manter o menu visível e um switch para processar a escolha
        do usuário. Além disso, o programa deve validar as entradas e garantir que as opções fornecidas pelo
        usuário sejam válidas. Utilize estruturas condicionais if para verificar se as entradas são válidas.

        Requisitos
            Opção 1: Solicitar dois números ao usuário e exibir a soma desses números.
            Opção 2: Solicitar um número ao usuário e exibir o quadrado desse número.
            Opção 3: Solicitar um número ao usuário e exibir a tabuada desse número (de 1 a 10).
            Opção 4: Encerra o programa e exibe uma mensagem de despedida.
            Entrada inválida: Caso o usuário digite uma opção inválida, exibir uma mensagem de erro e
solicitar uma nova entrada.

*/

package academy.java.lacosderepeticao.whiles;


import java.util.Scanner;

public class Aula0403MenuDiverso {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (true) {
            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("1 - Soma (Calcalar a soma de dois núemros)");
            System.out.println("2 - Quadrado (Calculo do quadrado de um número)");
            System.out.println("3 - Tabuada (Exibir tabuada do número digitado)");
            System.out.println("4 - Encerrar programa)");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    calcularSomaDeDoisNumeros(input);
                    break;
                case 2:
                    calcularQuadrado(input);
                    break;
                case 3:
                    tabuada(input);
                    break;
                case 4:
                    System.out.println(" ^-^ Programa encerrado ^-^ ");
                    input.close();
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static void calcularSomaDeDoisNumeros(Scanner input) {
        System.out.println("Digite n1: ");
        double n1 = input.nextDouble();
        System.out.println("Digite n2: ");
        double n2 = input.nextDouble();
        double soma = n1 + n2;

        System.out.printf("%.2f + %.2f = %.2f%n", n1,n2, soma);
    }
    public static void calcularQuadrado(Scanner input){
        System.out.println("Digite um número: ");
        double n1 = input.nextDouble();
        double quadrado = n1 * n1;

        System.out.printf("O quadrado de %.2f é : %.2f\n", n1,quadrado);
    }
    public static void tabuada(Scanner input){
        System.out.println("Digite um número: ");
        double n1 = input.nextDouble();
        for(int i = 1;i<=10; i++){
            System.out.printf("%.0f x %d = %.0f%n", n1, i, n1 * i);

        }
    }
}
