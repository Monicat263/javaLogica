package academy.java.estruturascondicionais.ifselse;/*
    -- Como secretário de alistamento militar eu gostaria que o meu sistema aceitasse os seguintes
    parametros para eu poder agilizar o proceso de cadastramento:
    -- Sexo válido apenas para,' M' ou 'F' e 'idade', sendo:



    -- Se sexo for M e idade for maior ou igual a 18 o sistema deve imprimir 'Alistamento obrigatório'
    -- Se sexo for M e idade for menor ou igual a 18 o sistema deve imprimir 'Alistamento não permitido'

    -- Se sexo for F e idade for maior ou igual a 18 o sistema deve imprimir 'Deseja se alistar'
    -- Se sexo for F e idade for menor que 18 o sistema deve impirmir 'Alistamento não permitido'

 */

import java.util.Scanner;
/* Refatoração GPT
 */
public class AlistamentoMilitar03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu sexo, sendo F (Feminino) e M (Masculino): ");
        char sexoEntrada = input.next().charAt(0);
        System.out.println("Digite sua idade:");
        int idadeEntrada = input.nextInt();

        // Convertendo para maiúsculo
        sexoEntrada = Character.toUpperCase(sexoEntrada);

        // Validação do sexo e da idade
        if (sexoEntrada != 'F' && sexoEntrada != 'M') {
            System.out.println("Sexo inválido.");
        } else if (idadeEntrada < 0) {
            System.out.println("Idade inválida.");
        } else {
            // Lógica de alistamento
            if (sexoEntrada == 'M') {
                if (idadeEntrada >= 18) {
                    System.out.println("Alistamento obrigatório.");
                } else {
                    System.out.println("Alistamento não permitido.");
                }
            } else { // sexoEntrada == 'F'
                if (idadeEntrada >= 18) {
                    System.out.println("Deseja se alistar?");
                } else {
                    System.out.println("Alistamento não permitido.");
                }
            }
        }

        input.close();
    }
}



