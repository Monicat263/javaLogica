/*
    Faça um programa que imprima todos os números impares de 0 até o
    valor digitado pelo usuário
 */

package academy.java.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digtite um número qualquer: ");
        int vlrUsuario = input.nextInt();
        int i = 0;

        while (i <= vlrUsuario){
            if(i %2 !=0)
            System.out.println(i);
            i++;
        }
        System.out.println("ddddd " + vlrUsuario + i++);
    }
}
