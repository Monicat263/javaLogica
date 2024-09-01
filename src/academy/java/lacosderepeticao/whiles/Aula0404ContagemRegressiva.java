/*
  Crie um programa em Java que simule uma contagem regressiva de lançamento de um foguete.
  O programa deve iniciar a contagem a partir de 10 e, a cada iteração, exibir o número atual da
  contagem. Quando a contagem chegar a zero, o programa deve exibir a mensagem "Lançamento!"
  e encerrar a execução.
     Requisitos:
       Utilize um laço while para realizar a contagem regressiva.
       A contagem deve começar em 10 e terminar em 0.
       Ao final da contagem, exiba a mensagem "Lançamento!".

*/

package academy.java.lacosderepeticao.whiles;

public class Aula0404ContagemRegressiva {
    public static void main(String[] args) {

        int contador = 10;  // Inicia a contagem em 10

        while (contador >= 0) {  // Continua enquanto o contador for maior ou igual a 0
            System.out.println(contador);  // Exibe o valor atual do contador
            contador--;  // Decrementa o contador em 1
        }

        System.out.println("Lançamento!");  // Exibe a mensagem de lançamento
    }
}
