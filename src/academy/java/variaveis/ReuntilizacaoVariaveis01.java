package academy.java.variaveis;/*
 -- Crie uma variável que irá guardar o valor de um salário, cálcule a porcentagem desse
 -- salário sendo valores da porcentagem:
   -- 30%
   -- 15%
   -- 5%
  -- A cada vez que você calcular guarde o resultado em uma variável, imprima o reseultado e reutilize a variável
  -- que guarde o resultado para o novo cálculo, repetir o processo
  -- Fiz com o IF
 */

public class ReuntilizacaoVariaveis01 {
    public static void main(String[] args) {
        double  sal = 5000.00F;
        double resultado = sal * 0.3;
        System.out.println("30%  é: " + resultado);
        resultado = sal * 0.15;
        System.out.println("15%  é: " + resultado);
        resultado = sal * 0.05;
        System.out.println("5%  é: " + resultado);

    }

}
