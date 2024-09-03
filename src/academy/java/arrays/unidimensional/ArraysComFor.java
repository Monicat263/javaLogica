/*
    Elabore um programa que recebe um array de 4 valores, esse array guardrá a nota de uma luno
    se a nota for válida então o programa deverá realizar o cálculo da média  se não for um valor válido
    o programa deverá solicitar que o usuário digite um valor válido.
 */
package academy.java.arrays;

import java.util.Scanner;

public class ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner input = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.println("Digite a nota " + (i + 1) + ": ");
                notas[i] = input.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Opção inválida. Digite um número válido entre 0 e 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10);
            soma += notas[i];
        }

        double media = soma / notas.length;

        if (media >= 7 && media <= 10) {
            System.out.println("A média do aluno é: " + media + " - Aluno aprovado");
        } else if (media > 5 && media < 7) {
            System.out.println("A média do aluno é: " + media + " - Aluno em recuperação");
        } else if (media <= 4) {
            System.out.println("A média do aluno é: " + media + " - Aluno reprovado");
        } else {
            System.out.println("Nada a declarar. Média: " + media);
        }
    }
}


