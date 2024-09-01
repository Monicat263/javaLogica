package academy.java.variaveis;/*
    -- Para ler os dados do teclado é necessário fazer o import de:
       1 -- java.util.Scanner
       2 -- Inicializar a classe Scanner:
            -- Scanner teclado = new Scanner(Sytem.in);
       3 --  Inicializar a variável para pegar as informções do teclado:
              --  String nome = teclado.next();
       4 - Fechar o scanner Exemplo: teclado.close();
   -- Observações: Incluir teclado no nome da variável mas pode ser qualquer nome
   -- Ser a variavel for do tipo int então o comando para ler será teclado NextInt()
 */

import java.util.Scanner;

public class RecebendoDadosDoTeclado01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeEntrada = entrada.next();

        System.out.println("Digite sua idade: ");
        int idadeEntrada = entrada.nextInt();

        if (idadeEntrada < 0) {
            System.out.println("Idade inválida");
        } else if (idadeEntrada <= 10) {
            System.out.println("Paricipante: " + nomeEntrada + " - Categoria: Infantil");
        } else if (idadeEntrada >= 11 && idadeEntrada <= 15) {
            System.out.println("Paricipante: " + nomeEntrada + " - Categoria: Juvenil");
        } else if (idadeEntrada >= 16 && idadeEntrada <= 19) {
            System.out.println("Paricipante: " + nomeEntrada + " - Categoria: Pré adulto");
        } else if (idadeEntrada > 20) {
            System.out.println("Paricipante: " + nomeEntrada + " - Categoria: Adulto");
        } else {
            System.out.println("Paricipante: " + nomeEntrada + " - Categoria: Sem classificação");
        }
        entrada.close();
    }
}


