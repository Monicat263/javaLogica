package academy.java.estruturascondicionais.ifselse;/*
    -- Dado um determinado número inteiro imprima se ele é impar ou par
     -- lódiga para resolver:  Se o resto da divisão de um número por 2 for igual a 0,
     --então o número é par; caso contrário, ele é ímpar.
 */

public class NumeroImparOuPar {

    public static void main(String[] args) {
        int num = 0;
        if (num % 2 == 0) {
            System.out.println("O numero " + num + " é par");
        } else {
            System.out.println("O numero " + num + " é impar");

        }
    }
}
