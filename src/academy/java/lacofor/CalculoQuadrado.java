/*
    Elaborar uma programa que apresente os quadrados dos números inteiros existentes na
    faixa de valores de 15 até 200
 */

package academy.java.lacofor;

public class CalculoQuadrado {
    public static void main(String[] args) {
        System.out.println("O quadrado do número perfeito é a multiplicação dele vezes ele, veja o cálculo abaixo: ");
        for (int i = 15; i <=200; i++) {
            int quadrado = i * i;

            System.out.println(i + " X " + i + " = " + quadrado);
        }
    }
}
