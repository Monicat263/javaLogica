/*
    Elaborar um programa que calcule e apresente a tabuada de um número qualquer
 */

package academy.java.lacofor;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digtie um número de 1 à 10: ");
        int n1 = input.nextInt();

        for ( int i = 1; i<=10 ; i++) {
            int tabuada = n1 * i;
            System.out.println(n1 + " X " + i + " = "+ tabuada);
            }
        }
    }

