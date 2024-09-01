/*
   Como usuário, gostaria de ter um menu visual que seja navegável através de números.
   O menu deve ser exibido da seguinte forma:
    1 - Calcular média de notas
    2 - Converter temperaturas (Celsius para Fahrenheit)
    3 - Sair
*/

package academy.java.lacosderepeticao.whiles;

import java.util.Locale;
import java.util.Scanner;

public class Aula0402MenuDiverso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         double escolha = 0;

        while(true){
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Calcular média de notas");
            System.out.println("2 - Converter temperaturas (Celsius para Fahrenheit");
            System.out.println("3 - Sair");
            escolha = input.nextDouble();

            // Switch para seleção de escolha
            switch((int) escolha){
                case 1:
                    calcularMedia(input);
                    break;
                case 2:
                    converterTemperaturaCelsiusParaFahrenheit(input);
                    break;
                case 3:
                    System.out.println("Opção Sair");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
    // Método para calcular a média de três notas
    public static void calcularMedia(Scanner input){

        System.out.println("Digtie a n1: ");
        double n1 = input.nextDouble();
        System.out.println("Digtie a n2: ");
        double n2 = input.nextDouble();
        System.out.println("Digtie a n3: ");
        double n3 = input.nextDouble();
        if( n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0 && n3 <= 10 && n3 >= 0 ){
            double media = (n1+n2+n3) / 3;
            System.out.printf(" A média do aluno é: %.2f%n", media);
        }else {
            System.out.println("Umas das notas é inválida.");
        }

    }

    // Método para converter temperatura de Celsius para Fahrenheit
    public static void converterTemperaturaCelsiusParaFahrenheit(Scanner input){
        System.out.println("Digite a temperuta em graus Celsius: ");
        double celsius = input.nextDouble();
        double temperaturaConvertida = (celsius * 9/5) + 32;

        System.out.printf(Locale.US,"A temperatura em Fahrenheit é: %.2f%n", temperaturaConvertida);
    }
}