/*
   Crie um jogo com dois usuários
    o usuário 01 vai informar um número
    o usuário 02 vai inoforma um número
        se os números forem iguais apresente a msg "números iguais"
        se for diferente apresente a msg "números diferentes"
   Exiba a msg  "Deseja continuar?"

*/

package academy.java.lacosderepeticao.whiles;

import java.util.Scanner;
public class Aula05DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int desejacontinuar = 1;

        do {
            System.out.println("Digite um número qualquer: ");
            n1 = input.nextInt();
            System.out.println("Digite um úmero qualquer: ");
            n2 = input.nextInt();
            if (n1 == n2) {
                System.out.println(n1 +" e " + n2 + " são iguais ^-^");
                System.out.println("************************************");
                System.out.println("Deseja continuar o jogo?");
                System.out.println(" 1 - SIM ");
                System.out.println(" 2 - NÃO ");
                desejacontinuar = input.nextInt();
            } else {
                System.out.println(n1 +" e " + n2 + " são diferentes ^-~");
                System.out.println("************************************");
                System.out.println("Deseja continuar o jogo?");
                System.out.println(" 1 - SIM ");
                System.out.println(" 2 - NÃO ");
                desejacontinuar = input.nextInt();
            }
        }while (desejacontinuar == 1);
        input.close();
    }

}