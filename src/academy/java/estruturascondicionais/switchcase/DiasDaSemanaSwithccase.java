package academy.java.estruturascondicionais.switchcase;
/*
    -- Recebe  um número inteiro do usuário e imprima o dia da semana correspondente sendo:
      -- 1 - Domingo
      -- 2 - Segunda
      -- 3 - Terça
      -- 4 - Quarta
      -- 5 - Quinta
      -- 6 - Sexta
      -- 7 - Sabádo
      Utilize a estrutura switch case
 */

import java.util.Scanner;

public class DiasDaSemanaSwithccase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número de 1 até 7 para saber qual será o dia da semana: ");
        int diaDaSemana = input.nextInt();
        String dia;

        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda - feira";
                break;
            case 3:
                dia = "Terça - feira";
                break;
            case 4:
                dia = "Quarta feira";
                break;
            case 5:
                dia = "Quinta -feira";
                break;
            case 6:
                dia = "Sexta - feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = " Opção Inválida";
                break;
        }
        System.out.println("O dia selecionado é: " + dia);
    }
}
