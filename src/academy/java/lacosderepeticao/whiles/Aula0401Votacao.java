/*
   Elabore um programa em Java que simule um sistema de votação. O programa deve apresentar um menu com três
   opções de candidatos (A, B e C) e uma opção para encerrar a votação.
   O usuário deve digitar o nome do candidato ou escolher a opção de encerrar a votação.
   O programa deve validar a entrada para garantir
   que o usuário digitou um candidato válido ou a opção de encerrar.

    Se o usuário digitar um nome de candidato válido, o programa deve incrementar o número de votos
    para aquele candidato.
    Se o usuário digitar uma opção inválida, o programa deve exibir uma mensagem de erro e solicitar
    novamente a escolha.
    O laço while deve continuar pedindo a escolha do usuário até que a opção de encerrar a votação seja selecionada.
    Ao final da votação, o programa deve exibir o total de votos para cada candidato e declarar o vencedor
    (ou informar que houve um empate).
*/

package academy.java.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula0401Votacao {
    public static void main(String[] args) {
        int votosCandidadto01 = 0;
        int votosCandidadto02 = 0;
        int votosCandidadto03 = 0;

        String candidato01 = "Pabllo Marçal";
        String candidato02 = "Tabata Amaral";
        String candidato03 = "Marina Helena";

        String escolha;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma das opções: ");

            System.out.println("A - " + candidato01);
            System.out.println("B - " + candidato02);
            System.out.println("C - " + candidato03);
            System.out.println("S - Encerrar votação");
            System.out.print("Digite a sua escolha: ");

            escolha = input.nextLine().toUpperCase();

            // Processa a escolha do usuário
            switch (escolha) {
                case "A":
                    votosCandidadto01++;
                    System.out.println("Voto registrado para o candidato(a): " + candidato01);
                    break;
                case "B":
                    votosCandidadto02++;
                    System.out.println("Voto registrado para o candidato(a): " + candidato02);
                    break;
                case "C":
                    votosCandidadto03++;
                    System.out.println("Voto registrado para o candidato(a): " + candidato03);
                    break;
                case "S":
                    System.out.println("Votação encerrada.");
                    exibirResultados(votosCandidadto01, votosCandidadto02, votosCandidadto03, candidato01, candidato02, candidato03);
                    return; // Encerra o loop e o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            input.close();
        }
    }

    // Método para exibir os resultados e declarar o vencedor ou empate
    public static void exibirResultados(int votosCandidadto01, int votosCandidadto02, int votosCandidadto03, String candidato01, String candidato02, String candidato03) {
        System.out.println("\nResultado da votação:");
        System.out.println(candidato01 + ": " + votosCandidadto01 + " votos");
        System.out.println(candidato02 + ": " + votosCandidadto02 + " votos");
        System.out.println(candidato03 + ": " + votosCandidadto03 + " votos");

        if (votosCandidadto01 > votosCandidadto02 && votosCandidadto01 > votosCandidadto03) {
            System.out.println("Vencedor: " + candidato01);
        } else if (votosCandidadto02 > votosCandidadto01 && votosCandidadto02 > votosCandidadto03) {
            System.out.println("Vencedor: " + candidato02);
        } else if (votosCandidadto03 > votosCandidadto01 && votosCandidadto03 > votosCandidadto02) {
            System.out.println("Vencedor: " + candidato03);
        } else {
            System.out.println("Houve um empate.");
        }
    }
}