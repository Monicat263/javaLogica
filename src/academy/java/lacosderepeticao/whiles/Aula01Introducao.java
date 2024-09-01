/*
    Faça um programa que  imprima de 0 até o valor digitado pelo usuário
 */

package academy.java.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula01Introducao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digtite um número qualquer: ");
        int vlrUsuario = input.nextInt();
        int i = 0;

        while (i <= vlrUsuario){
            System.out.println(i);
            i++;
        }

    }
}
