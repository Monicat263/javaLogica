package academy.java.variaveis;
/*
    -- Recebe  um número inteiro do usuário e imprima o dia da semana correspondente sendo:
      -- 1 - Domingo
      -- 2 - Segunda
      -- 3 - Terça
      -- 4 - Quarta
      -- 5 - Quinta
      -- 6 - Sexta
      -- 7 - Sabádo
 */

import java.util.Scanner;

public class DiasDaSemanaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 até 7 para saber qual será o dia da semana: ");
        int diaDaSemana = input.nextInt();
        if (diaDaSemana <=0 || diaDaSemana > 7){
            System.out.println(" Valor inválido :( . Digte um número válido de 1 a 7");
        }else if (diaDaSemana == 1){
            System.out.println("Domingo");
        }else if (diaDaSemana == 2) {
            System.out.println("Segunda-feira");
        }else if (diaDaSemana == 3) {
            System.out.println("Terça-feira");
        }else if (diaDaSemana == 4) {
            System.out.println("Quarta-feira");
        }else if (diaDaSemana == 5) {
            System.out.println("Quinta-feira");
        }else if (diaDaSemana == 6) {
            System.out.println("Sexta-feira");
        }else if (diaDaSemana == 7) {
            System.out.println("Sábado");
        }
    }
}
